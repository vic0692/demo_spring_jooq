package com.example.jooq.demo_jooq.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCountEntity {
    private String organizationName;
    private Integer employeeCount;
}
