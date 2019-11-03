/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatGetBackendIdsetRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class PgStatGetBackendIdset extends TableImpl<PgStatGetBackendIdsetRecord> {

    private static final long serialVersionUID = 1896230007;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_backend_idset</code>
     */
    public static final PgStatGetBackendIdset PG_STAT_GET_BACKEND_IDSET = new PgStatGetBackendIdset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGetBackendIdsetRecord> getRecordType() {
        return PgStatGetBackendIdsetRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_backend_idset.pg_stat_get_backend_idset</code>.
     */
    public final TableField<PgStatGetBackendIdsetRecord, Integer> PG_STAT_GET_BACKEND_IDSET_ = createField(DSL.name("pg_stat_get_backend_idset"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_get_backend_idset</code> table reference
     */
    public PgStatGetBackendIdset() {
        this(DSL.name("pg_stat_get_backend_idset"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table reference
     */
    public PgStatGetBackendIdset(String alias) {
        this(DSL.name(alias), PG_STAT_GET_BACKEND_IDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_backend_idset</code> table reference
     */
    public PgStatGetBackendIdset(Name alias) {
        this(alias, PG_STAT_GET_BACKEND_IDSET);
    }

    private PgStatGetBackendIdset(Name alias, Table<PgStatGetBackendIdsetRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgStatGetBackendIdset(Name alias, Table<PgStatGetBackendIdsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatGetBackendIdset(Table<O> child, ForeignKey<O, PgStatGetBackendIdsetRecord> key) {
        super(child, key, PG_STAT_GET_BACKEND_IDSET);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetBackendIdset as(String alias) {
        return new PgStatGetBackendIdset(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetBackendIdset as(Name alias) {
        return new PgStatGetBackendIdset(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetBackendIdset rename(String name) {
        return new PgStatGetBackendIdset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetBackendIdset rename(Name name) {
        return new PgStatGetBackendIdset(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetBackendIdset call() {
        return new PgStatGetBackendIdset(DSL.name(getName()), null, new Field[] { 
        });
    }
}
