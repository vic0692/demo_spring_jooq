/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgAvailableExtensionsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class PgAvailableExtensions extends TableImpl<PgAvailableExtensionsRecord> {

    private static final long serialVersionUID = -1232831183;

    /**
     * The reference instance of <code>pg_catalog.pg_available_extensions</code>
     */
    public static final PgAvailableExtensions PG_AVAILABLE_EXTENSIONS = new PgAvailableExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAvailableExtensionsRecord> getRecordType() {
        return PgAvailableExtensionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> DEFAULT_VERSION = createField(DSL.name("default_version"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_available_extensions.installed_version</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> INSTALLED_VERSION = createField(DSL.name("installed_version"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> COMMENT = createField(DSL.name("comment"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_available_extensions</code> table reference
     */
    public PgAvailableExtensions() {
        this(DSL.name("pg_available_extensions"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extensions</code> table reference
     */
    public PgAvailableExtensions(String alias) {
        this(DSL.name(alias), PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extensions</code> table reference
     */
    public PgAvailableExtensions(Name alias) {
        this(alias, PG_AVAILABLE_EXTENSIONS);
    }

    private PgAvailableExtensions(Name alias, Table<PgAvailableExtensionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAvailableExtensions(Name alias, Table<PgAvailableExtensionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAvailableExtensions(Table<O> child, ForeignKey<O, PgAvailableExtensionsRecord> key) {
        super(child, key, PG_AVAILABLE_EXTENSIONS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgAvailableExtensions as(String alias) {
        return new PgAvailableExtensions(DSL.name(alias), this);
    }

    @Override
    public PgAvailableExtensions as(Name alias) {
        return new PgAvailableExtensions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensions rename(String name) {
        return new PgAvailableExtensions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensions rename(Name name) {
        return new PgAvailableExtensions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
