/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStopBackupRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class PgStopBackup extends TableImpl<PgStopBackupRecord> {

    private static final long serialVersionUID = 487874663;

    /**
     * The reference instance of <code>pg_catalog.pg_stop_backup</code>
     */
    public static final PgStopBackup PG_STOP_BACKUP = new PgStopBackup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStopBackupRecord> getRecordType() {
        return PgStopBackupRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStopBackupRecord, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stop_backup.labelfile</code>.
     */
    public final TableField<PgStopBackupRecord, String> LABELFILE = createField(DSL.name("labelfile"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stop_backup.spcmapfile</code>.
     */
    public final TableField<PgStopBackupRecord, String> SPCMAPFILE = createField(DSL.name("spcmapfile"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stop_backup</code> table reference
     */
    public PgStopBackup() {
        this(DSL.name("pg_stop_backup"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stop_backup</code> table reference
     */
    public PgStopBackup(String alias) {
        this(DSL.name(alias), PG_STOP_BACKUP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stop_backup</code> table reference
     */
    public PgStopBackup(Name alias) {
        this(alias, PG_STOP_BACKUP);
    }

    private PgStopBackup(Name alias, Table<PgStopBackupRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private PgStopBackup(Name alias, Table<PgStopBackupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStopBackup(Table<O> child, ForeignKey<O, PgStopBackupRecord> key) {
        super(child, key, PG_STOP_BACKUP);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStopBackup as(String alias) {
        return new PgStopBackup(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStopBackup as(Name alias) {
        return new PgStopBackup(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStopBackup rename(String name) {
        return new PgStopBackup(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStopBackup rename(Name name) {
        return new PgStopBackup(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgStopBackup call(Boolean exclusive, Boolean waitForArchive) {
        return new PgStopBackup(DSL.name(getName()), null, new Field[] { 
              DSL.val(exclusive, org.jooq.impl.SQLDataType.BOOLEAN)
            , DSL.val(waitForArchive, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
        });
    }

    /**
     * Call this table-valued function
     */
    public PgStopBackup call(Field<Boolean> exclusive, Field<Boolean> waitForArchive) {
        return new PgStopBackup(DSL.name(getName()), null, new Field[] { 
              exclusive
            , waitForArchive
        });
    }
}
