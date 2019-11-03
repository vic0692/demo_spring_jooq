/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgStatXactAllTables;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class PgStatXactAllTablesRecord extends TableRecordImpl<PgStatXactAllTablesRecord> implements Record11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 562305642;

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public void setSeqScan(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public Long getSeqScan() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public Long getSeqTupRead() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public void setIdxScan(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public Long getIdxScan() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public Long getIdxTupFetch() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public void setNTupIns(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public Long getNTupIns() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public Long getNTupUpd() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public void setNTupDel(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public Long getNTupDel() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public Long getNTupHotUpd() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.RELID;
    }

    @Override
    public Field<String> field2() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.SCHEMANAME;
    }

    @Override
    public Field<String> field3() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.RELNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.SEQ_SCAN;
    }

    @Override
    public Field<Long> field5() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.SEQ_TUP_READ;
    }

    @Override
    public Field<Long> field6() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.IDX_SCAN;
    }

    @Override
    public Field<Long> field7() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.IDX_TUP_FETCH;
    }

    @Override
    public Field<Long> field8() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.N_TUP_INS;
    }

    @Override
    public Field<Long> field9() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.N_TUP_UPD;
    }

    @Override
    public Field<Long> field10() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.N_TUP_DEL;
    }

    @Override
    public Field<Long> field11() {
        return PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES.N_TUP_HOT_UPD;
    }

    @Override
    public Long component1() {
        return getRelid();
    }

    @Override
    public String component2() {
        return getSchemaname();
    }

    @Override
    public String component3() {
        return getRelname();
    }

    @Override
    public Long component4() {
        return getSeqScan();
    }

    @Override
    public Long component5() {
        return getSeqTupRead();
    }

    @Override
    public Long component6() {
        return getIdxScan();
    }

    @Override
    public Long component7() {
        return getIdxTupFetch();
    }

    @Override
    public Long component8() {
        return getNTupIns();
    }

    @Override
    public Long component9() {
        return getNTupUpd();
    }

    @Override
    public Long component10() {
        return getNTupDel();
    }

    @Override
    public Long component11() {
        return getNTupHotUpd();
    }

    @Override
    public Long value1() {
        return getRelid();
    }

    @Override
    public String value2() {
        return getSchemaname();
    }

    @Override
    public String value3() {
        return getRelname();
    }

    @Override
    public Long value4() {
        return getSeqScan();
    }

    @Override
    public Long value5() {
        return getSeqTupRead();
    }

    @Override
    public Long value6() {
        return getIdxScan();
    }

    @Override
    public Long value7() {
        return getIdxTupFetch();
    }

    @Override
    public Long value8() {
        return getNTupIns();
    }

    @Override
    public Long value9() {
        return getNTupUpd();
    }

    @Override
    public Long value10() {
        return getNTupDel();
    }

    @Override
    public Long value11() {
        return getNTupHotUpd();
    }

    @Override
    public PgStatXactAllTablesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value3(String value) {
        setRelname(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value4(Long value) {
        setSeqScan(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value5(Long value) {
        setSeqTupRead(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value6(Long value) {
        setIdxScan(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value7(Long value) {
        setIdxTupFetch(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value8(Long value) {
        setNTupIns(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value9(Long value) {
        setNTupUpd(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value10(Long value) {
        setNTupDel(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord value11(Long value) {
        setNTupHotUpd(value);
        return this;
    }

    @Override
    public PgStatXactAllTablesRecord values(Long value1, String value2, String value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatXactAllTablesRecord
     */
    public PgStatXactAllTablesRecord() {
        super(PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES);
    }

    /**
     * Create a detached, initialised PgStatXactAllTablesRecord
     */
    public PgStatXactAllTablesRecord(Long relid, String schemaname, String relname, Long seqScan, Long seqTupRead, Long idxScan, Long idxTupFetch, Long nTupIns, Long nTupUpd, Long nTupDel, Long nTupHotUpd) {
        super(PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES);

        set(0, relid);
        set(1, schemaname);
        set(2, relname);
        set(3, seqScan);
        set(4, seqTupRead);
        set(5, idxScan);
        set(6, idxTupFetch);
        set(7, nTupIns);
        set(8, nTupUpd);
        set(9, nTupDel);
        set(10, nTupHotUpd);
    }
}
