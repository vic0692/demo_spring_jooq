package com.example.jooq.demo_jooq.Services;

import com.example.jooq.demo_jooq.Entities.Employee;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private DSLContext dsl;
    com.example.jooq.demo_jooq.introduction.db.public_.tables.Employee employee = com.example.jooq.demo_jooq.introduction.db.public_.tables.Employee.EMPLOYEE;

    public Result<Record> getEmployee() {
        return dsl.select(employee.fields()).from(employee).fetch();
    }

}