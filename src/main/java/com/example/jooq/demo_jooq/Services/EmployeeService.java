package com.example.jooq.demo_jooq.Services;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveGroupedEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeSupervisorEntity;
import com.example.jooq.demo_jooq.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.jooq.Record5;
import org.jooq.Result;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeService {
    EmployeeRepository repository;

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        Integer id = repository.createEmployee(employeeEntity);
        return getEmployee(id);
    }

    public EmployeeEntity getEmployee(Integer id) {
        return repository.getEmployee(id);
    }

    public List<EmployeeEntity> employeeList() {
        return repository.employeeList();
    }

    public EmployeeEntity updateEmployee(Integer id, EmployeeEntity employee) {
        Integer idEmployee = repository.updateEmployee(id, employee);
        return repository.getEmployee(idEmployee);
    }

    public Boolean deleteEmployee(List<Integer> ids) {
        ids.removeAll(repository.getEmployeesWithSubordinatesByIds(ids));
        if (ids.size() > 0) {
            repository.deleteEmployee(ids);
            return true;
        }
        else {
            return false;
        }
    }

    public List<EmployeeSupervisorEntity> getEmployeeSupervisor() {
        return repository.getEmployeeSupervisor();
    }

    public List<EmployeeRecursiveEntity> getEmployeeTree() {
        return repository.getEmployeeTree();
    }

    public List<EmployeeRecursiveGroupedEntity> getEmployeeTree1() {
        return repository.getEmployeeTree1();
    }

}