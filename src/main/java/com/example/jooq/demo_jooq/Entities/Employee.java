package com.example.jooq.demo_jooq.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Integer organizationId;
    private Integer superviserId;

    public Employee(Integer id, String surname, String name, String patronymic, Integer organizationId, Integer superviserId) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.organizationId = organizationId;
        this.superviserId = superviserId;
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

    public Integer getSuperviserId() {
        return superviserId;
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

    public void setSuperviserId(Integer superviserId) {
        this.superviserId = superviserId;
    }

    /*patronymic не нулевой длины*/
    public boolean equal(Employee employee) {
        if (this.surname == employee.getSurname() && this.name == employee.getName() && this.patronymic != null
                && employee.getPatronymic() != null && this.patronymic == employee.getPatronymic() && this.organizationId == employee.organizationId) {
            return true;
        }
        else {
            return false;
        }
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
