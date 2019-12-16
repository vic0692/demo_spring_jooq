package com.example.jooq.demo_jooq.Repository;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveGroupedEntity;
import com.example.jooq.demo_jooq.introduction.db.tables.daos.EmployeeDao;
import com.example.jooq.demo_jooq.introduction.db.tables.pojos.Employee;
import lombok.AllArgsConstructor;
import org.jooq.*;
import org.jooq.impl.DSL.*;
import org.jooq.util.postgres.PostgresDSL;
import org.springframework.stereotype.Repository;
import com.example.jooq.demo_jooq.Entities.EmployeeSupervisorEntity;
import org.thymeleaf.expression.Lists;

import static com.example.jooq.demo_jooq.introduction.db.Sequences.EMPLOYEE_ID_SEQ1;
import static com.example.jooq.demo_jooq.introduction.db.tables.Employee.EMPLOYEE;
import static com.example.jooq.demo_jooq.introduction.db.tables.Organization.ORGANIZATION;
import static org.jooq.impl.DSL.*;
import static org.jooq.util.postgres.PostgresDSL.array;

import java.util.*;

@Repository
@AllArgsConstructor
public class EmployeeRepository {

    private final DSLContext dslContext;
    private final EmployeeDao employeeDao;

    public Integer createEmployee(EmployeeEntity employeeEntity) {
        /*нужна возможность добавления руководителя только данной организации*/

        Integer id = dslContext.nextval(EMPLOYEE_ID_SEQ1);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setSurname(employeeEntity.getSurname());
        employee.setName(employeeEntity.getName());
        employee.setPatronymic(employeeEntity.getPatronymic());
        employee.setOrganizationId(employeeEntity.getOrganizationId());
        employee.setSupervisorId(employeeEntity.getSupervisorId());

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
                .set(EMPLOYEE.ORGANIZATION_ID, employee.getOrganizationId())
                .set(EMPLOYEE.SUPERVISOR_ID, employee.getSupervisorId())
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
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISOR_ID)
                .from(EMPLOYEE)
                .where(EMPLOYEE.ID.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<Integer> getAllSupervisors() {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISOR_ID)
                .from(EMPLOYEE)
                .fetch()
                .into(Integer.TYPE);
    }

    public Collection<Integer> getEmployeesWithSubordinatesByIds(List<Integer> ids) {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISOR_ID)
                .from(EMPLOYEE)
                .where(EMPLOYEE.SUPERVISOR_ID.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<EmployeeSupervisorEntity> getEmployeeSupervisor() {
        return dslContext.select(EMPLOYEE.as("Empl").ID, EMPLOYEE.as("Empl").SURNAME, EMPLOYEE.as("Empl").NAME, EMPLOYEE.as("Empl").PATRONYMIC, EMPLOYEE.as("Empl").ORGANIZATION_ID, ORGANIZATION.ORGANIZATION_NAME, EMPLOYEE.as("Empl").SUPERVISOR_ID, EMPLOYEE.as("Supv").SURNAME.as("supervisorName"))
                .from(EMPLOYEE.as("Empl"))
                .join(ORGANIZATION)
                .on(EMPLOYEE.as("Empl").ORGANIZATION_ID.equal(ORGANIZATION.ID))
                .leftJoin(EMPLOYEE.as("Supv"))
                .on(EMPLOYEE.as("Empl").SUPERVISOR_ID.eq(EMPLOYEE.as("Supv").ID))
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
        Field<Integer[]> path = array(EMPLOYEE.ID).as("path");
        Field<Integer> level = inline(1).as("level");
        Field<String> display = inline("- ").concat(EMPLOYEE.SURNAME).as("display");

        return dslContext.withRecursive("r").as(
                select(EMPLOYEE.ID, EMPLOYEE.SURNAME, EMPLOYEE.NAME, EMPLOYEE.PATRONYMIC, EMPLOYEE.ORGANIZATION_ID, EMPLOYEE.SUPERVISOR_ID, path, level, display)
                        .from(EMPLOYEE)
                        .where(EMPLOYEE.SUPERVISOR_ID.isNull())
                        .unionAll(
                                select(EMPLOYEE.ID, EMPLOYEE.SURNAME, EMPLOYEE.NAME, EMPLOYEE.PATRONYMIC, EMPLOYEE.ORGANIZATION_ID, EMPLOYEE.SUPERVISOR_ID, PostgresDSL.arrayAppend(path, EMPLOYEE.ID), level.add(inline(1)), repeat(inline(" "), level).concat("- ").concat(EMPLOYEE.ID))
                                        .from(EMPLOYEE)
                                        .join(table(name("r"))).on(field(name("r", "id"), Integer.class).eq(EMPLOYEE.SUPERVISOR_ID)))

        )
                .select()
                .from(table(name("r")))
                .orderBy(path)
                .fetch()
                .into(EmployeeRecursiveEntity.class);
    }

    /* ПРОБУЕМ ИЕРАРХИЮ */
    public List<EmployeeRecursiveGroupedEntity> getEmployeeTree1() {
        com.example.jooq.demo_jooq.introduction.db.tables.Employee T1 = EMPLOYEE.as("T1");
        com.example.jooq.demo_jooq.introduction.db.tables.Employee T2 = EMPLOYEE.as("T2");

        Map<Record, Result<Record>> recordResultMap = dslContext
                .select()
                .from(T1)
                .join(T2)
                .on(T1.ID.eq(T2.SUPERVISOR_ID))
                .where(T1.SUPERVISOR_ID.isNull())
                .fetch()
                .intoGroups(T1.fields());

        List<EmployeeRecursiveGroupedEntity> resultList = new ArrayList<EmployeeRecursiveGroupedEntity>();

        recordResultMap.forEach((record, result) -> {
            EmployeeRecursiveGroupedEntity group = record.into(EmployeeRecursiveGroupedEntity.class);
            List<EmployeeRecursiveGroupedEntity> children = new ArrayList<EmployeeRecursiveGroupedEntity>();

            result.forEach(r -> {
                if (Objects.nonNull(r.getValue(6))) {
                    children.add(r.into(EmployeeRecursiveGroupedEntity.class));
                }
            });

            for(EmployeeRecursiveGroupedEntity child : children) {
                group.setChildren(child);
            }
            //group.setChildren(children);
            resultList.add(group);

        });

        return resultList;
    }
}
