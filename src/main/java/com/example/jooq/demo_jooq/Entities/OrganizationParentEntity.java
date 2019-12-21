package com.example.jooq.demo_jooq.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationParentEntity {
    private Integer id;
    private String organizationName;
    private Integer parentOrganizationId;
    private String parentOrganizationName;
}
