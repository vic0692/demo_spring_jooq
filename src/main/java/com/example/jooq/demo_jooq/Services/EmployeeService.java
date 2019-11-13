package com.example.jooq.demo_jooq.Services;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if (validateDeleteEmployee(ids)) {
            ids.removeAll(repository.getAllSupervisorsByIds(ids));
            repository.deleteEmployee(ids);
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validateDeleteEmployee (List<Integer> ids) {
        return ids.size() > repository.getAllSupervisorsByIds(ids).size();
    }
}