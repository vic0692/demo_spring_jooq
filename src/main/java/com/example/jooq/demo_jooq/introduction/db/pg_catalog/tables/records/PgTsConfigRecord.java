/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgTsConfig;

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
public class PgTsConfigRecord extends TableRecordImpl<PgTsConfigRecord> implements Record4<String, Long, Long, Long> {

    private static final long serialVersionUID = 1377943622;

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public void setCfgname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public String getCfgname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public void setCfgnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public Long getCfgnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public void setCfgowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public Long getCfgowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public void setCfgparser(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public Long getCfgparser() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgTsConfig.PG_TS_CONFIG.CFGNAME;
    }

    @Override
    public Field<Long> field2() {
        return PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE;
    }

    @Override
    public Field<Long> field3() {
        return PgTsConfig.PG_TS_CONFIG.CFGOWNER;
    }

    @Override
    public Field<Long> field4() {
        return PgTsConfig.PG_TS_CONFIG.CFGPARSER;
    }

    @Override
    public String component1() {
        return getCfgname();
    }

    @Override
    public Long component2() {
        return getCfgnamespace();
    }

    @Override
    public Long component3() {
        return getCfgowner();
    }

    @Override
    public Long component4() {
        return getCfgparser();
    }

    @Override
    public String value1() {
        return getCfgname();
    }

    @Override
    public Long value2() {
        return getCfgnamespace();
    }

    @Override
    public Long value3() {
        return getCfgowner();
    }

    @Override
    public Long value4() {
        return getCfgparser();
    }

    @Override
    public PgTsConfigRecord value1(String value) {
        setCfgname(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value2(Long value) {
        setCfgnamespace(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value3(Long value) {
        setCfgowner(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value4(Long value) {
        setCfgparser(value);
        return this;
    }

    @Override
    public PgTsConfigRecord values(String value1, Long value2, Long value3, Long value4) {
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
     * Create a detached PgTsConfigRecord
     */
    public PgTsConfigRecord() {
        super(PgTsConfig.PG_TS_CONFIG);
    }

    /**
     * Create a detached, initialised PgTsConfigRecord
     */
    public PgTsConfigRecord(String cfgname, Long cfgnamespace, Long cfgowner, Long cfgparser) {
        super(PgTsConfig.PG_TS_CONFIG);

        set(0, cfgname);
        set(1, cfgnamespace);
        set(2, cfgowner);
        set(3, cfgparser);
    }
}
