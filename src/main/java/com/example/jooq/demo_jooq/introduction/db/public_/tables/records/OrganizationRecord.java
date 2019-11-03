/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.public_.tables.records;


import com.example.jooq.demo_jooq.introduction.db.public_.tables.Organization;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationRecord extends UpdatableRecordImpl<OrganizationRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -1728697668;

    /**
     * Setter for <code>public.Organization.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Organization.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.Organization.organization_name</code>.
     */
    public void setOrganizationName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Organization.organization_name</code>.
     */
    public String getOrganizationName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.Organization.parent_organization</code>.
     */
    public void setParentOrganization(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Organization.parent_organization</code>.
     */
    public Integer getParentOrganization() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Organization.ORGANIZATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Organization.ORGANIZATION.ORGANIZATION_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Organization.ORGANIZATION.PARENT_ORGANIZATION;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOrganizationName();
    }

    @Override
    public Integer component3() {
        return getParentOrganization();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOrganizationName();
    }

    @Override
    public Integer value3() {
        return getParentOrganization();
    }

    @Override
    public OrganizationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationRecord value2(String value) {
        setOrganizationName(value);
        return this;
    }

    @Override
    public OrganizationRecord value3(Integer value) {
        setParentOrganization(value);
        return this;
    }

    @Override
    public OrganizationRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizationRecord
     */
    public OrganizationRecord() {
        super(Organization.ORGANIZATION);
    }

    /**
     * Create a detached, initialised OrganizationRecord
     */
    public OrganizationRecord(Integer id, String organizationName, Integer parentOrganization) {
        super(Organization.ORGANIZATION);

        set(0, id);
        set(1, organizationName);
        set(2, parentOrganization);
    }
}
