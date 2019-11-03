/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgLargeobject;

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
public class PgLargeobjectRecord extends TableRecordImpl<PgLargeobjectRecord> implements Record3<Long, Integer, byte[]> {

    private static final long serialVersionUID = 459438483;

    /**
     * Setter for <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public void setLoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public Long getLoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public void setPageno(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public Integer getPageno() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject.data</code>.
     */
    public void setData(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject.data</code>.
     */
    public byte[] getData() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Integer, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Integer, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgLargeobject.PG_LARGEOBJECT.LOID;
    }

    @Override
    public Field<Integer> field2() {
        return PgLargeobject.PG_LARGEOBJECT.PAGENO;
    }

    @Override
    public Field<byte[]> field3() {
        return PgLargeobject.PG_LARGEOBJECT.DATA;
    }

    @Override
    public Long component1() {
        return getLoid();
    }

    @Override
    public Integer component2() {
        return getPageno();
    }

    @Override
    public byte[] component3() {
        return getData();
    }

    @Override
    public Long value1() {
        return getLoid();
    }

    @Override
    public Integer value2() {
        return getPageno();
    }

    @Override
    public byte[] value3() {
        return getData();
    }

    @Override
    public PgLargeobjectRecord value1(Long value) {
        setLoid(value);
        return this;
    }

    @Override
    public PgLargeobjectRecord value2(Integer value) {
        setPageno(value);
        return this;
    }

    @Override
    public PgLargeobjectRecord value3(byte... value) {
        setData(value);
        return this;
    }

    @Override
    public PgLargeobjectRecord values(Long value1, Integer value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLargeobjectRecord
     */
    public PgLargeobjectRecord() {
        super(PgLargeobject.PG_LARGEOBJECT);
    }

    /**
     * Create a detached, initialised PgLargeobjectRecord
     */
    public PgLargeobjectRecord(Long loid, Integer pageno, byte[] data) {
        super(PgLargeobject.PG_LARGEOBJECT);

        set(0, loid);
        set(1, pageno);
        set(2, data);
    }
}