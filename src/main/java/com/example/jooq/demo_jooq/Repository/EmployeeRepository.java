package com.example.jooq.demo_jooq.Repository;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveGroupedEntity;
import com.example.jooq.demo_jooq.introduction.db.tables.daos.EmployeeDao;
import com.example.jooq.demo_jooq.introduction.db.tables.pojos.Employee;
import lombok.AllArgsConstructor;
import lombok.val;
import org.jooq.*;
import org.jooq.impl.DSL.*;
import org.jooq.tools.json.JSONObject;
import org.jooq.util.postgres.PostgresDSL;
import org.springframework.stereotype.Repository;
import com.example.jooq.demo_jooq.Entities.EmployeeSupervisorEntity;
import org.thymeleaf.expression.Lists;

import static com.example.jooq.demo_jooq.introduction.db.Sequences.EMPLOYEE_ID_SEQ;
import static com.example.jooq.demo_jooq.introduction.db.tables.Employee.EMPLOYEE;
import static com.example.jooq.demo_jooq.introduction.db.tables.Organization.ORGANIZATION;
import static org.jooq.impl.DSL.*;
import static org.jooq.util.postgres.PostgresDSL.array;
import static org.jooq.util.postgres.PostgresDSL.stringToArray;

import java.util.*;

@Repository
@AllArgsConstructor
public class EmployeeRepository {

    private final DSLContext dslContext;
    private final EmployeeDao employeeDao;

    public Integer createEmployee(EmployeeEntity employeeEntity) {
        /*нужна возможность добавления руководителя только данной организации*/

        Integer id = dslContext.nextval(EMPLOYEE_ID_SEQ);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setSurname(employeeEntity.getSurname());
        employee.setName(employeeEntity.getName());
        employee.setPatronymic(employeeEntity.getPatronymic());
        employee.setOrganizationid(employeeEntity.getOrganizationId());
        employee.setSupervisorid(employeeEntity.getSupervisorId());

        employeeDao.insert(employee);

        return id;
    }

    public EmployeeEntity getEmployee(Integer id) {
        return dslContext.select(EMPLOYEE.fields())
                .from(EMPLOYEE)
                .where(EMPLOYEE.ID.eq(id))
                .fetchOneInto(EmployeeEntity.class);
    }


    public List<EmployeeEntity> employeeList() {
        /*нужен пейджинг и фильграция*/
        return dslContext.select(EMPLOYEE.fields())
                .from(EMPLOYEE)
                .fetch()
                .into(EmployeeEntity.class);
    }

    public Integer updateEmployee(Integer id, EmployeeEntity employee) {
        /*нужна возможность добавления руководителя только данной организации*/
        dslContext.update(EMPLOYEE).set(EMPLOYEE.SURNAME, employee.getSurname())
                .set(EMPLOYEE.NAME, employee.getName())
                .set(EMPLOYEE.PATRONYMIC, employee.getPatronymic())
                .set(EMPLOYEE.ORGANIZATIONID, employee.getOrganizationId())
                .set(EMPLOYEE.SUPERVISORID, employee.getSupervisorId())
                .where(EMPLOYEE.ID.eq(id))
                .execute();
        return id;
    }

    public void deleteEmployee(List<Integer> ids) {
        dslContext.deleteFrom(EMPLOYEE)
                .where(EMPLOYEE.ID.in(ids))
                .execute();
    }

    public List<Integer> getAllSupervisorsByIds(List<Integer> ids) {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISORID)
                .from(EMPLOYEE)
                .where(EMPLOYEE.ID.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<Integer> getAllSupervisors() {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISORID)
                .from(EMPLOYEE)
                .fetch()
                .into(Integer.TYPE);
    }

    public Collection<Integer> getEmployeesWithSubordinatesByIds(List<Integer> ids) {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISORID)
                .from(EMPLOYEE)
                .where(EMPLOYEE.SUPERVISORID.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<EmployeeSupervisorEntity> getEmployeeSupervisor() {
        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, ORGANIZATION.ORGANIZATIONNAME, EMPLOYEE.as("Empl").SUPERVISORID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATIONID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("Supv").ID))
                .orderBy(EMPLOYEE.as("Empl").ID)
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    /* Передаем супервизор ид для получения этого супервизора*/
    public EmployeeEntity getEmployeeSupervisorById(Integer id) {
        return dslContext.select(EMPLOYEE.fields())
                .from(EMPLOYEE)
                .where(EMPLOYEE.ID.equal(id))
                .fetchOne()
                .into(EmployeeEntity.class);
    }

    /*Дерево с путем и отображением*/
    public List<EmployeeRecursiveEntity> getEmployeeTree() {
        Field<Integer[]> path = array(EMPLOYEE.as("Empl").ID).as("path");
        Field<Integer> level = inline(1).as("level");
        Field<String> display = inline("- ").concat(EMPLOYEE.as("Empl").SURNAME).as("display");

        return dslContext.withRecursive("r").as(
                select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, EMPLOYEE.as("Empl").SUPERVISORID, ORGANIZATION.ORGANIZATIONNAME.as("organizationName"), EMPLOYEE.as("supv").SURNAME.as("supervisorName"), path, level, display)
                        .from(EMPLOYEE.as("Empl"))
                        .fullJoin(ORGANIZATION)
                        .on(EMPLOYEE.as("Empl").ORGANIZATIONID.eq(ORGANIZATION.ID))
                        .leftJoin(EMPLOYEE.as("supv"))
                        .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("supv").ID))
                        .where(EMPLOYEE.as("Empl").SUPERVISORID.isNull())
                        .unionAll(
                                select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, EMPLOYEE.as("Empl").SUPERVISORID, ORGANIZATION.ORGANIZATIONNAME.as("organizationName"), EMPLOYEE.as("supv").SURNAME.as("supervisorName"), PostgresDSL.arrayAppend(path, EMPLOYEE.as("Empl").ID), level.add(inline(1)), repeat(inline(" "), level).concat("- ").concat(EMPLOYEE.as("Empl").ID))
                                        .from(EMPLOYEE.as("Empl"))
                                        .fullJoin(ORGANIZATION)
                                        .on(EMPLOYEE.as("Empl").ORGANIZATIONID.eq(ORGANIZATION.ID))
                                        .leftJoin(EMPLOYEE.as("supv"))
                                        .on(EMPLOYEE.as("Empl").SUPERVISORID.equal(EMPLOYEE.as("supv").ID))
                                        .join(table(name("r")))
                                        .on(field(name("r", "id"), Integer.class).eq(EMPLOYEE.as("Empl").SUPERVISORID)))

        )
                .select()
                .from(table(name("r")))
                .orderBy(path)
                .fetch()
                .into(EmployeeRecursiveEntity.class);
    }

    public List<EmployeeSupervisorEntity> getEmployeeTree1() {
        Field<Integer[]> path = array(EMPLOYEE.as("Empl").ID).as("path");
        Field<Integer> level = inline(1).as("level");
        Field<String> display = inline("- ").concat(EMPLOYEE.as("Empl").SURNAME).as("display");

        return dslContext.withRecursive("r").as(
                select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, EMPLOYEE.as("Empl").SUPERVISORID, ORGANIZATION.ORGANIZATIONNAME.as("organizationName"), EMPLOYEE.as("supv").SURNAME.as("supervisorName"))
                        .from(EMPLOYEE.as("Empl"))
                        .fullJoin(ORGANIZATION)
                        .on(EMPLOYEE.as("Empl").ORGANIZATIONID.eq(ORGANIZATION.ID))
                        .leftJoin(EMPLOYEE.as("supv"))
                        .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("supv").ID))
                        .where(EMPLOYEE.as("Empl").SUPERVISORID.isNull())
                        .unionAll(
                                select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, EMPLOYEE.as("Empl").SUPERVISORID, ORGANIZATION.ORGANIZATIONNAME.as("organizationName"), EMPLOYEE.as("supv").SURNAME.as("supervisorName"))
                                        .from(EMPLOYEE.as("Empl"))
                                        .fullJoin(ORGANIZATION)
                                        .on(EMPLOYEE.as("Empl").ORGANIZATIONID.eq(ORGANIZATION.ID))
                                        .leftJoin(EMPLOYEE.as("supv"))
                                        .on(EMPLOYEE.as("Empl").SUPERVISORID.equal(EMPLOYEE.as("supv").ID))
                                        .join(table(name("r")))
                                        .on(field(name("r", "id"), Integer.class).eq(EMPLOYEE.as("Empl").SUPERVISORID)))

        )
                .select()
                .from(table(name("r")))
                //.orderBy(table(name("r")).field("supervisorName"))
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    public List<EmployeeSupervisorEntity> getRoot() {
        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, ORGANIZATION.ORGANIZATIONNAME, EMPLOYEE.as("Empl").SUPERVISORID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATIONID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("Supv").ID))
                .where(EMPLOYEE.as("Empl").SUPERVISORID.isNull())
                .orderBy(EMPLOYEE.as("Empl").ID)
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    public List<EmployeeSupervisorEntity> getBranch(Integer id) {
        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, ORGANIZATION.ORGANIZATIONNAME, EMPLOYEE.as("Empl").SUPERVISORID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATIONID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("Supv").ID))
                .where(EMPLOYEE.as("Empl").SUPERVISORID.eq(id))
                .orderBy(EMPLOYEE.as("Empl").ID)
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    /*получить страницу записей*/
    public List<EmployeeSupervisorEntity> getPage(Integer pageSize,  Integer start) {
        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, ORGANIZATION.ORGANIZATIONNAME, EMPLOYEE.as("Empl").SUPERVISORID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATIONID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("Supv").ID))
                .orderBy(EMPLOYEE.as("Empl").ID)
                .offset(start)
                .limit(pageSize)
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    public Integer getCount() {
        return dslContext.selectCount()
                .from(EMPLOYEE)
                .fetchOne()
                .into(Integer.class);
    }

    public List<EmployeeSupervisorEntity> getPageFiltered(Integer pageSize, Integer start, JSONObject json) {
        Condition condition = EMPLOYEE.as("Empl").ID.isNotNull();
        if (json.get("employee").toString().length() > 0) {
            condition = condition.and(EMPLOYEE.as("Empl").SURNAME.like(json.get("employee").toString()));
        }
        if (json.get("organization").toString().length() > 0) {
            condition = condition.and(ORGANIZATION.ORGANIZATIONNAME.like(json.get("organization").toString()));
        }

        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATIONID, ORGANIZATION.ORGANIZATIONNAME, EMPLOYEE.as("Empl").SUPERVISORID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATIONID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISORID.eq(EMPLOYEE.as("Supv").ID))
                .where(condition)
                .orderBy(EMPLOYEE.as("Empl").ID)
                .offset(start)
                .limit(pageSize)
                .fetch()
                .into(EmployeeSupervisorEntity.class);
    }

    public Integer getCountFiltered(JSONObject json) {
        Condition condition = EMPLOYEE.ID.isNotNull();
        if (json.get("employee").toString().length() > 0) {
            //if (surname.length() > 0) {
            condition = condition.and(EMPLOYEE.SURNAME.like(json.get("employee").toString()));
        }

        if (json.get("organization").toString().length() > 0) {
            condition = condition.and(ORGANIZATION.ORGANIZATIONNAME.like(json.get("organization").toString()));
        }

        return dslContext.selectCount()
                .from(EMPLOYEE)
                .fullJoin(ORGANIZATION)
                .on(EMPLOYEE.ORGANIZATIONID.eq(ORGANIZATION.ID))
                .where(condition)
                .fetchOne()
                .into(Integer.class);
    }
}
