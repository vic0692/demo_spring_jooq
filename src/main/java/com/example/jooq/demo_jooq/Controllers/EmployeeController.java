package com.example.jooq.demo_jooq.Controllers;

import com.example.jooq.demo_jooq.Entities.Employee;
import com.example.jooq.demo_jooq.Services.EmployeeService;
import com.sun.org.apache.regexp.internal.RE;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
     @Autowired
     EmployeeService service;

    /* Create - post, read - get, update - put, delete - delete */

    /*
    public Employee createEmployee() {

    }



    public Employee updateEmployee() {

    }

    public Employee deleteEmployee() {

    }
    */


    @RequestMapping("/getEmployee")
    public Result<Record> getEmployee() {
        return service.getEmployee();
    }


/*
    @RequestMapping("/getEmployee")
    public Employee getEmployee() {
        return new Employee(1, "2","3","4", 5,6 );
    }

 */

}
