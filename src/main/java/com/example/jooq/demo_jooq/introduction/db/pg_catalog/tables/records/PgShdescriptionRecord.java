/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgShdescription;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class PgShdescriptionRecord extends TableRecordImpl<PgShdescriptionRecord> implements Record3<Long, Long, String> {

    private static final long serialVersionUID = -2037718446;

    /**
     * Setter for <code>pg_catalog.pg_shdescription.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdescription.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdescription.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgShdescription.PG_SHDESCRIPTION.OBJOID;
    }

    @Override
    public Field<Long> field2() {
        return PgShdescription.PG_SHDESCRIPTION.CLASSOID;
    }

    @Override
    public Field<String> field3() {
        return PgShdescription.PG_SHDESCRIPTION.DESCRIPTION;
    }

    @Override
    public Long component1() {
        return getObjoid();
    }

    @Override
    public Long component2() {
        return getClassoid();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Long value1() {
        return getObjoid();
    }

    @Override
    public Long value2() {
        return getClassoid();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public PgShdescriptionRecord value1(Long value) {
        setObjoid(value);
        return this;
    }

    @Override
    public PgShdescriptionRecord value2(Long value) {
        setClassoid(value);
        return this;
    }

    @Override
    public PgShdescriptionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public PgShdescriptionRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShdescriptionRecord
     */
    public PgShdescriptionRecord() {
        super(PgShdescription.PG_SHDESCRIPTION);
    }

    /**
     * Create a detached, initialised PgShdescriptionRecord
     */
    public PgShdescriptionRecord(Long objoid, Long classoid, String description) {
        super(PgShdescription.PG_SHDESCRIPTION);

        set(0, objoid);
        set(1, classoid);
        set(2, description);
    }
}