/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgShowAllSettingsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class PgShowAllSettings extends TableImpl<PgShowAllSettingsRecord> {

    private static final long serialVersionUID = 371801513;

    /**
     * The reference instance of <code>pg_catalog.pg_show_all_settings</code>
     */
    public static final PgShowAllSettings PG_SHOW_ALL_SETTINGS = new PgShowAllSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShowAllSettingsRecord> getRecordType() {
        return PgShowAllSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_show_all_settings.name</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.setting</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SETTING = createField(DSL.name("setting"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.unit</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> UNIT = createField(DSL.name("unit"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.category</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> CATEGORY = createField(DSL.name("category"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.short_desc</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SHORT_DESC = createField(DSL.name("short_desc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.extra_desc</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> EXTRA_DESC = createField(DSL.name("extra_desc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.context</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> CONTEXT = createField(DSL.name("context"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.vartype</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> VARTYPE = createField(DSL.name("vartype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.source</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.min_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> MIN_VAL = createField(DSL.name("min_val"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.max_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> MAX_VAL = createField(DSL.name("max_val"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.enumvals</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String[]> ENUMVALS = createField(DSL.name("enumvals"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.boot_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> BOOT_VAL = createField(DSL.name("boot_val"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.reset_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> RESET_VAL = createField(DSL.name("reset_val"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.sourcefile</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SOURCEFILE = createField(DSL.name("sourcefile"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.sourceline</code>.
     */
    public final TableField<PgShowAllSettingsRecord, Integer> SOURCELINE = createField(DSL.name("sourceline"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.pending_restart</code>.
     */
    public final TableField<PgShowAllSettingsRecord, Boolean> PENDING_RESTART = createField(DSL.name("pending_restart"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings() {
        this(DSL.name("pg_show_all_settings"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings(String alias) {
        this(DSL.name(alias), PG_SHOW_ALL_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings(Name alias) {
        this(alias, PG_SHOW_ALL_SETTINGS);
    }

    private PgShowAllSettings(Name alias, Table<PgShowAllSettingsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgShowAllSettings(Name alias, Table<PgShowAllSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgShowAllSettings(Table<O> child, ForeignKey<O, PgShowAllSettingsRecord> key) {
        super(child, key, PG_SHOW_ALL_SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgShowAllSettings as(String alias) {
        return new PgShowAllSettings(DSL.name(alias), this, parameters);
    }

    @Override
    public PgShowAllSettings as(Name alias) {
        return new PgShowAllSettings(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowAllSettings rename(String name) {
        return new PgShowAllSettings(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowAllSettings rename(Name name) {
        return new PgShowAllSettings(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String[], String, String, String, Integer, Boolean> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgShowAllSettings call() {
        return new PgShowAllSettings(DSL.name(getName()), null, new Field[] { 
        });
    }
}
