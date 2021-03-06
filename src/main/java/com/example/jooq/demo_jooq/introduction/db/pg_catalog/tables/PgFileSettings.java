/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgFileSettingsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class PgFileSettings extends TableImpl<PgFileSettingsRecord> {

    private static final long serialVersionUID = -76099833;

    /**
     * The reference instance of <code>pg_catalog.pg_file_settings</code>
     */
    public static final PgFileSettings PG_FILE_SETTINGS = new PgFileSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgFileSettingsRecord> getRecordType() {
        return PgFileSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_file_settings.sourcefile</code>.
     */
    public final TableField<PgFileSettingsRecord, String> SOURCEFILE = createField(DSL.name("sourcefile"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.sourceline</code>.
     */
    public final TableField<PgFileSettingsRecord, Integer> SOURCELINE = createField(DSL.name("sourceline"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.seqno</code>.
     */
    public final TableField<PgFileSettingsRecord, Integer> SEQNO = createField(DSL.name("seqno"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.name</code>.
     */
    public final TableField<PgFileSettingsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.setting</code>.
     */
    public final TableField<PgFileSettingsRecord, String> SETTING = createField(DSL.name("setting"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.applied</code>.
     */
    public final TableField<PgFileSettingsRecord, Boolean> APPLIED = createField(DSL.name("applied"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.error</code>.
     */
    public final TableField<PgFileSettingsRecord, String> ERROR = createField(DSL.name("error"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_file_settings</code> table reference
     */
    public PgFileSettings() {
        this(DSL.name("pg_file_settings"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_file_settings</code> table reference
     */
    public PgFileSettings(String alias) {
        this(DSL.name(alias), PG_FILE_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_file_settings</code> table reference
     */
    public PgFileSettings(Name alias) {
        this(alias, PG_FILE_SETTINGS);
    }

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgFileSettings(Table<O> child, ForeignKey<O, PgFileSettingsRecord> key) {
        super(child, key, PG_FILE_SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgFileSettings as(String alias) {
        return new PgFileSettings(DSL.name(alias), this);
    }

    @Override
    public PgFileSettings as(Name alias) {
        return new PgFileSettings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgFileSettings rename(String name) {
        return new PgFileSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgFileSettings rename(Name name) {
        return new PgFileSettings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, Integer, String, String, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
