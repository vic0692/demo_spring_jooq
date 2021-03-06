/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.public_.tables;


import com.example.jooq.demo_jooq.introduction.db.public_.Indexes;
import com.example.jooq.demo_jooq.introduction.db.public_.Keys;
import com.example.jooq.demo_jooq.introduction.db.public_.Public;
import com.example.jooq.demo_jooq.introduction.db.public_.tables.records.OrganizationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Organization extends TableImpl<OrganizationRecord> {

    private static final long serialVersionUID = 1770986582;

    /**
     * The reference instance of <code>public.Organization</code>
     */
    public static final Organization ORGANIZATION = new Organization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationRecord> getRecordType() {
        return OrganizationRecord.class;
    }

    /**
     * The column <code>public.Organization.id</code>.
     */
    public final TableField<OrganizationRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('organization_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Organization.organization_name</code>.
     */
    public final TableField<OrganizationRecord, String> ORGANIZATION_NAME = createField(DSL.name("organization_name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.Organization.parent_organization</code>.
     */
    public final TableField<OrganizationRecord, Integer> PARENT_ORGANIZATION = createField(DSL.name("parent_organization"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.Organization</code> table reference
     */
    public Organization() {
        this(DSL.name("Organization"), null);
    }

    /**
     * Create an aliased <code>public.Organization</code> table reference
     */
    public Organization(String alias) {
        this(DSL.name(alias), ORGANIZATION);
    }

    /**
     * Create an aliased <code>public.Organization</code> table reference
     */
    public Organization(Name alias) {
        this(alias, ORGANIZATION);
    }

    private Organization(Name alias, Table<OrganizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organization(Name alias, Table<OrganizationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Organization(Table<O> child, ForeignKey<O, OrganizationRecord> key) {
        super(child, key, ORGANIZATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORGANIZATION_PK);
    }

    @Override
    public Identity<OrganizationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORGANIZATION;
    }

    @Override
    public UniqueKey<OrganizationRecord> getPrimaryKey() {
        return Keys.ORGANIZATION_PK;
    }

    @Override
    public List<UniqueKey<OrganizationRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganizationRecord>>asList(Keys.ORGANIZATION_PK);
    }

    @Override
    public Organization as(String alias) {
        return new Organization(DSL.name(alias), this);
    }

    @Override
    public Organization as(Name alias) {
        return new Organization(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(String name) {
        return new Organization(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(Name name) {
        return new Organization(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
