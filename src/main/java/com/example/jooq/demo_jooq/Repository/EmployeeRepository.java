package com.example.jooq.demo_jooq.Repository;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.introduction.db.tables.daos.EmployeeDao;
import com.example.jooq.demo_jooq.introduction.db.tables.pojos.Employee;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.example.jooq.demo_jooq.introduction.db.Sequences.EMPLOYEE_ID_SEQ1;
import static com.example.jooq.demo_jooq.introduction.db.tables.Employee.EMPLOYEE;

import java.util.List;

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
        return dslContext.select(EMPLOYEE.fields()).from(EMPLOYEE).where(EMPLOYEE.ID.eq(id)).fetchOneInto(EmployeeEntity.class);
    }


    public List<EmployeeEntity> employeeList() {
        /*нужен пейджинг и фильграция*/
        return dslContext.select(EMPLOYEE.fields()).from(EMPLOYEE).fetch().into(EmployeeEntity.class);
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

    public Boolean deleteEmployee(List<Integer> ids) {
        if (validateDeleteEmployee(ids)) {
            ids.removeAll(getAllSupervisorsByIds(ids)); //удалит из ids значения супервизоров
            dslContext.deleteFrom(EMPLOYEE).where(EMPLOYEE.ID.in(ids));
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validateDeleteEmployee (List<Integer> ids) {
        return ids.size() > getAllSupervisorsByIds(ids).size();
    }

    public List<Integer> getAllSupervisorsByIds(List<Integer> ids) {
        return dslContext.selectDistinct(EMPLOYEE.SUPERVISOR_ID).from(EMPLOYEE).where(EMPLOYEE.ID.in(ids)).fetch().into(Integer.TYPE);
    }

}
