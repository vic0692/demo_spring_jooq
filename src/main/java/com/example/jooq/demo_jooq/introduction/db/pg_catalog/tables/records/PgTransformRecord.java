/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgTransform;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgTransformRecord extends TableRecordImpl<PgTransformRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = -459597616;

    /**
     * Setter for <code>pg_catalog.pg_transform.trftype</code>.
     */
    public void setTrftype(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trftype</code>.
     */
    public Long getTrftype() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trflang</code>.
     */
    public void setTrflang(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trflang</code>.
     */
    public Long getTrflang() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public void setTrffromsql(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public String getTrffromsql() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public void setTrftosql(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public String getTrftosql() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTransform.PG_TRANSFORM.TRFTYPE;
    }

    @Override
    public Field<Long> field2() {
        return PgTransform.PG_TRANSFORM.TRFLANG;
    }

    @Override
    public Field<String> field3() {
        return PgTransform.PG_TRANSFORM.TRFFROMSQL;
    }

    @Override
    public Field<String> field4() {
        return PgTransform.PG_TRANSFORM.TRFTOSQL;
    }

    @Override
    public Long component1() {
        return getTrftype();
    }

    @Override
    public Long component2() {
        return getTrflang();
    }

    @Override
    public String component3() {
        return getTrffromsql();
    }

    @Override
    public String component4() {
        return getTrftosql();
    }

    @Override
    public Long value1() {
        return getTrftype();
    }

    @Override
    public Long value2() {
        return getTrflang();
    }

    @Override
    public String value3() {
        return getTrffromsql();
    }

    @Override
    public String value4() {
        return getTrftosql();
    }

    @Override
    public PgTransformRecord value1(Long value) {
        setTrftype(value);
        return this;
    }

    @Override
    public PgTransformRecord value2(Long value) {
        setTrflang(value);
        return this;
    }

    @Override
    public PgTransformRecord value3(String value) {
        setTrffromsql(value);
        return this;
    }

    @Override
    public PgTransformRecord value4(String value) {
        setTrftosql(value);
        return this;
    }

    @Override
    public PgTransformRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTransformRecord
     */
    public PgTransformRecord() {
        super(PgTransform.PG_TRANSFORM);
    }

    /**
     * Create a detached, initialised PgTransformRecord
     */
    public PgTransformRecord(Long trftype, Long trflang, String trffromsql, String trftosql) {
        super(PgTransform.PG_TRANSFORM);

        set(0, trftype);
        set(1, trflang);
        set(2, trffromsql);
        set(3, trftosql);
    }
}
