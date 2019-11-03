/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgStatUserIndexes;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgStatUserIndexesRecord extends TableRecordImpl<PgStatUserIndexesRecord> implements Record8<Long, Long, String, String, String, Long, Long, Long> {

    private static final long serialVersionUID = -425425539;

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public void setRelname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public String getRelname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public void setIdxScan(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public Long getIdxScan() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public void setIdxTupRead(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public Long getIdxTupRead() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public Long getIdxTupFetch() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, String, String, String, Long, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, String, String, String, Long, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.RELID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.INDEXRELID;
    }

    @Override
    public Field<String> field3() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.SCHEMANAME;
    }

    @Override
    public Field<String> field4() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.RELNAME;
    }

    @Override
    public Field<String> field5() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.INDEXRELNAME;
    }

    @Override
    public Field<Long> field6() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_SCAN;
    }

    @Override
    public Field<Long> field7() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_TUP_READ;
    }

    @Override
    public Field<Long> field8() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_TUP_FETCH;
    }

    @Override
    public Long component1() {
        return getRelid();
    }

    @Override
    public Long component2() {
        return getIndexrelid();
    }

    @Override
    public String component3() {
        return getSchemaname();
    }

    @Override
    public String component4() {
        return getRelname();
    }

    @Override
    public String component5() {
        return getIndexrelname();
    }

    @Override
    public Long component6() {
        return getIdxScan();
    }

    @Override
    public Long component7() {
        return getIdxTupRead();
    }

    @Override
    public Long component8() {
        return getIdxTupFetch();
    }

    @Override
    public Long value1() {
        return getRelid();
    }

    @Override
    public Long value2() {
        return getIndexrelid();
    }

    @Override
    public String value3() {
        return getSchemaname();
    }

    @Override
    public String value4() {
        return getRelname();
    }

    @Override
    public String value5() {
        return getIndexrelname();
    }

    @Override
    public Long value6() {
        return getIdxScan();
    }

    @Override
    public Long value7() {
        return getIdxTupRead();
    }

    @Override
    public Long value8() {
        return getIdxTupFetch();
    }

    @Override
    public PgStatUserIndexesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value2(Long value) {
        setIndexrelid(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value3(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value4(String value) {
        setRelname(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value5(String value) {
        setIndexrelname(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value6(Long value) {
        setIdxScan(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value7(Long value) {
        setIdxTupRead(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord value8(Long value) {
        setIdxTupFetch(value);
        return this;
    }

    @Override
    public PgStatUserIndexesRecord values(Long value1, Long value2, String value3, String value4, String value5, Long value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatUserIndexesRecord
     */
    public PgStatUserIndexesRecord() {
        super(PgStatUserIndexes.PG_STAT_USER_INDEXES);
    }

    /**
     * Create a detached, initialised PgStatUserIndexesRecord
     */
    public PgStatUserIndexesRecord(Long relid, Long indexrelid, String schemaname, String relname, String indexrelname, Long idxScan, Long idxTupRead, Long idxTupFetch) {
        super(PgStatUserIndexes.PG_STAT_USER_INDEXES);

        set(0, relid);
        set(1, indexrelid);
        set(2, schemaname);
        set(3, relname);
        set(4, indexrelname);
        set(5, idxScan);
        set(6, idxTupRead);
        set(7, idxTupFetch);
    }
}
