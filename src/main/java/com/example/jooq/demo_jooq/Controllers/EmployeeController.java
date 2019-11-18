package com.example.jooq.demo_jooq.Controllers;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeSupervisorEntity;
import com.example.jooq.demo_jooq.Services.EmployeeService;

import lombok.AllArgsConstructor;
import org.jooq.Record5;
import org.jooq.Result;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee", produces = "application/json; charset=UTF-8")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService service;

    @PostMapping(path = "/new")
    @Transactional
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return service.createEmployee(employeeEntity);
    }

    @PutMapping(path = "/update/{id}")
    @Transactional
    public EmployeeEntity updateEmployee(@PathVariable Integer id, @RequestBody EmployeeEntity employee) {
        return service.updateEmployee(id, employee);
    }

    @PutMapping(path = "/delete")
    @Transactional
    public Boolean deleteEmployee(@RequestBody List<Integer> ids) {
        return service.deleteEmployee(ids);
    }

    @GetMapping(path = "/{id}")
    public EmployeeEntity getEmployee(@PathVariable Integer id) {
        return service.getEmployee(id);
    }

    @GetMapping(path = "/list")
    public List<EmployeeEntity> employeeList () {
        return service.employeeList();
    }

    @GetMapping(path =  "/listSup")
    public List<EmployeeSupervisorEntity> employeeListSupervisor()
    {
        return service.getEmployeeSupervisor();
    }
}
