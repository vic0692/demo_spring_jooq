package com.example.jooq.demo_jooq.Controllers;

import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeRecursiveEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeSupervisorEntity;
import com.example.jooq.demo_jooq.Services.EmployeeService;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.Integer;

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

    @GetMapping(path = "/getTree")
    public List<EmployeeRecursiveEntity> getEmployeeTree() {
        return service.getEmployeeTree();
    }

    /*@GetMapping(path = "/tree")
    public List<EmployeeRecursiveGroupedEntity> getEmployeeTree1() {
        return service.getEmployeeTree1();
    }*/

    @GetMapping(path = "/getRoot")
    public List<EmployeeSupervisorEntity> getRoot() {
        return service.getRoot();
    }

    @GetMapping(path = "{id}/getBranch")
    public List<EmployeeSupervisorEntity> getBranch(@PathVariable Integer id) {
        return service.getBranch(id);
    }

    @GetMapping(path = "/getPage/{page}")
    public List<EmployeeSupervisorEntity> getPage(@PathVariable Integer page) {
        return service.getPage(page);
    }

    @GetMapping(path = "/employeeCount")
    public Integer getCount() {
        return service.getCount();
    }

    @GetMapping(path = "/pagesCount")
    public Integer getPageCount() {
        return service.countPages();
    }



    @GetMapping(path = "/getFilteredPage/{page}")
    public List<EmployeeSupervisorEntity> getFilteredPage(@PathVariable Integer page, @RequestBody String employee, @RequestBody String organization) {
        return service.getFilteredPage(page, employee, organization);
    }

    @GetMapping(path = "/employeeFilteredCount")
    public Integer getFilteredCount(@RequestBody String employee, @RequestBody String organization) {
        return service.getFilteredCount(employee, organization);
    }
}
