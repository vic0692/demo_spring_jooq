/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatioUserTablesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PgStatioUserTables extends TableImpl<PgStatioUserTablesRecord> {

    private static final long serialVersionUID = 1862918465;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_user_tables</code>
     */
    public static final PgStatioUserTables PG_STATIO_USER_TABLES = new PgStatioUserTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioUserTablesRecord> getRecordType() {
        return PgStatioUserTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.relid</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> RELID = createField(DSL.name("relid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.schemaname</code>.
     */
    public final TableField<PgStatioUserTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.relname</code>.
     */
    public final TableField<PgStatioUserTablesRecord, String> RELNAME = createField(DSL.name("relname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.heap_blks_read</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> HEAP_BLKS_READ = createField(DSL.name("heap_blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.heap_blks_hit</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> HEAP_BLKS_HIT = createField(DSL.name("heap_blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.idx_blks_read</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.idx_blks_hit</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.toast_blks_read</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> TOAST_BLKS_READ = createField(DSL.name("toast_blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.toast_blks_hit</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> TOAST_BLKS_HIT = createField(DSL.name("toast_blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.tidx_blks_read</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> TIDX_BLKS_READ = createField(DSL.name("tidx_blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_tables.tidx_blks_hit</code>.
     */
    public final TableField<PgStatioUserTablesRecord, Long> TIDX_BLKS_HIT = createField(DSL.name("tidx_blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_user_tables</code> table reference
     */
    public PgStatioUserTables() {
        this(DSL.name("pg_statio_user_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_tables</code> table reference
     */
    public PgStatioUserTables(String alias) {
        this(DSL.name(alias), PG_STATIO_USER_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_tables</code> table reference
     */
    public PgStatioUserTables(Name alias) {
        this(alias, PG_STATIO_USER_TABLES);
    }

    private PgStatioUserTables(Name alias, Table<PgStatioUserTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioUserTables(Name alias, Table<PgStatioUserTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatioUserTables(Table<O> child, ForeignKey<O, PgStatioUserTablesRecord> key) {
        super(child, key, PG_STATIO_USER_TABLES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioUserTables as(String alias) {
        return new PgStatioUserTables(DSL.name(alias), this);
    }

    @Override
    public PgStatioUserTables as(Name alias) {
        return new PgStatioUserTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserTables rename(String name) {
        return new PgStatioUserTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserTables rename(Name name) {
        return new PgStatioUserTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
