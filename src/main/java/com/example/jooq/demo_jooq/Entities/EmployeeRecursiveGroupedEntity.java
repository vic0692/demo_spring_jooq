package com.example.jooq.demo_jooq.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRecursiveGroupedEntity {
    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Integer organizationId;
    private Integer supervisorId;
    private EmployeeEntity children;
}
