package com.example.jooq.demo_jooq.Entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class EmployeeEntity {

    private @Id
    @GeneratedValue
    Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Integer organizationId;
    private Integer supervisorId;

    public EmployeeEntity(Integer id, String surname, String name, String patronymic, Integer organizationId, Integer supervisorId) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.organizationId = organizationId;
        this.supervisorId = supervisorId;
    }

    public Integer getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public void setSupervisorId(Integer superviserId) {
        this.supervisorId = superviserId;
    }

    /*patronymic не нулевой длины*/
    public boolean equal(EmployeeEntity employeeEntity) {
        return this.surname == employeeEntity.getSurname() && this.name == employeeEntity.getName() && this.patronymic != null
                && employeeEntity.getPatronymic() != null && this.patronymic == employeeEntity.getPatronymic() && this.organizationId == employeeEntity.organizationId;
    }

    /* использовать get? */
    @Override
    public String toString() {
        String resultString = "Employee: " + this.surname + " " + this.name;
        if (this.patronymic != null) {
            resultString += " " + this.patronymic;
        }
        return resultString;
    }
}
