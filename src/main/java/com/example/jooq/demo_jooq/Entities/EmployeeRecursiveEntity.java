package com.example.jooq.demo_jooq.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRecursiveEntity {
    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Integer organizationId;
    private Integer supervisorId;
    private Integer[] path;
    private String display;
    private Integer level;
    private String organizationName;
    private String supervisorName;
}
