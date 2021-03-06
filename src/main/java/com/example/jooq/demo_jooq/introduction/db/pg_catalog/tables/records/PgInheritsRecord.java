/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgInherits;

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
public class PgInheritsRecord extends TableRecordImpl<PgInheritsRecord> implements Record3<Long, Long, Integer> {

    private static final long serialVersionUID = -1270915069;

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhrelid</code>.
     */
    public void setInhrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhrelid</code>.
     */
    public Long getInhrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhparent</code>.
     */
    public void setInhparent(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhparent</code>.
     */
    public Long getInhparent() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhseqno</code>.
     */
    public void setInhseqno(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhseqno</code>.
     */
    public Integer getInhseqno() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgInherits.PG_INHERITS.INHRELID;
    }

    @Override
    public Field<Long> field2() {
        return PgInherits.PG_INHERITS.INHPARENT;
    }

    @Override
    public Field<Integer> field3() {
        return PgInherits.PG_INHERITS.INHSEQNO;
    }

    @Override
    public Long component1() {
        return getInhrelid();
    }

    @Override
    public Long component2() {
        return getInhparent();
    }

    @Override
    public Integer component3() {
        return getInhseqno();
    }

    @Override
    public Long value1() {
        return getInhrelid();
    }

    @Override
    public Long value2() {
        return getInhparent();
    }

    @Override
    public Integer value3() {
        return getInhseqno();
    }

    @Override
    public PgInheritsRecord value1(Long value) {
        setInhrelid(value);
        return this;
    }

    @Override
    public PgInheritsRecord value2(Long value) {
        setInhparent(value);
        return this;
    }

    @Override
    public PgInheritsRecord value3(Integer value) {
        setInhseqno(value);
        return this;
    }

    @Override
    public PgInheritsRecord values(Long value1, Long value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgInheritsRecord
     */
    public PgInheritsRecord() {
        super(PgInherits.PG_INHERITS);
    }

    /**
     * Create a detached, initialised PgInheritsRecord
     */
    public PgInheritsRecord(Long inhrelid, Long inhparent, Integer inhseqno) {
        super(PgInherits.PG_INHERITS);

        set(0, inhrelid);
        set(1, inhparent);
        set(2, inhseqno);
    }
}
