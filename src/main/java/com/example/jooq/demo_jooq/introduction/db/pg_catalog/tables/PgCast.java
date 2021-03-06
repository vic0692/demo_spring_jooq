/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgCastRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class PgCast extends TableImpl<PgCastRecord> {

    private static final long serialVersionUID = 1746034349;

    /**
     * The reference instance of <code>pg_catalog.pg_cast</code>
     */
    public static final PgCast PG_CAST = new PgCast();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgCastRecord> getRecordType() {
        return PgCastRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_cast.castsource</code>.
     */
    public final TableField<PgCastRecord, Long> CASTSOURCE = createField(DSL.name("castsource"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public final TableField<PgCastRecord, Long> CASTTARGET = createField(DSL.name("casttarget"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public final TableField<PgCastRecord, Long> CASTFUNC = createField(DSL.name("castfunc"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public final TableField<PgCastRecord, String> CASTCONTEXT = createField(DSL.name("castcontext"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public final TableField<PgCastRecord, String> CASTMETHOD = createField(DSL.name("castmethod"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast() {
        this(DSL.name("pg_cast"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(String alias) {
        this(DSL.name(alias), PG_CAST);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cast</code> table reference
     */
    public PgCast(Name alias) {
        this(alias, PG_CAST);
    }

    private PgCast(Name alias, Table<PgCastRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgCast(Name alias, Table<PgCastRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgCast(Table<O> child, ForeignKey<O, PgCastRecord> key) {
        super(child, key, PG_CAST);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_CAST_SOURCE_TARGET_INDEX);
    }

    @Override
    public PgCast as(String alias) {
        return new PgCast(DSL.name(alias), this);
    }

    @Override
    public PgCast as(Name alias) {
        return new PgCast(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(String name) {
        return new PgCast(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCast rename(Name name) {
        return new PgCast(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
