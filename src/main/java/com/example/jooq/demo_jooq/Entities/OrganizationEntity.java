package com.example.jooq.demo_jooq.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OrganizationEntity {

    private @Id
    @GeneratedValue
    Integer id;
    private String organizationName;
    private Integer parentOrganizationId;

    public OrganizationEntity(Integer id, String organizationName, Integer parentOrganizationId) {
        this.id = id;
        this.organizationName = organizationName;
        this.parentOrganizationId = parentOrganizationId;
    }

    public Integer getId() {
        return id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public Integer getParentOrganizationId() {
        return parentOrganizationId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setParentOrganizationId(Integer parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId;
    }

    public boolean equals(OrganizationEntity organizationEntity) {
        return this.organizationName == organizationEntity.getOrganizationName() && this.parentOrganizationId == organizationEntity.getParentOrganizationId();
    }

    /* использовать get? */
    @Override
    public String toString() {
        return "Organization: " + this.organizationName;
    }

}
