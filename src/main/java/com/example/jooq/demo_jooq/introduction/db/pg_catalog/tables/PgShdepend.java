/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgShdependRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgShdepend extends TableImpl<PgShdependRecord> {

    private static final long serialVersionUID = -1301537378;

    /**
     * The reference instance of <code>pg_catalog.pg_shdepend</code>
     */
    public static final PgShdepend PG_SHDEPEND = new PgShdepend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShdependRecord> getRecordType() {
        return PgShdependRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public final TableField<PgShdependRecord, Long> DBID = createField(DSL.name("dbid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public final TableField<PgShdependRecord, Long> CLASSID = createField(DSL.name("classid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public final TableField<PgShdependRecord, Long> OBJID = createField(DSL.name("objid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public final TableField<PgShdependRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public final TableField<PgShdependRecord, Long> REFCLASSID = createField(DSL.name("refclassid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public final TableField<PgShdependRecord, Long> REFOBJID = createField(DSL.name("refobjid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public final TableField<PgShdependRecord, String> DEPTYPE = createField(DSL.name("deptype"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend() {
        this(DSL.name("pg_shdepend"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend(String alias) {
        this(DSL.name(alias), PG_SHDEPEND);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    public PgShdepend(Name alias) {
        this(alias, PG_SHDEPEND);
    }

    private PgShdepend(Name alias, Table<PgShdependRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShdepend(Name alias, Table<PgShdependRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgShdepend(Table<O> child, ForeignKey<O, PgShdependRecord> key) {
        super(child, key, PG_SHDEPEND);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_SHDEPEND_DEPENDER_INDEX, Indexes.PG_SHDEPEND_REFERENCE_INDEX);
    }

    @Override
    public PgShdepend as(String alias) {
        return new PgShdepend(DSL.name(alias), this);
    }

    @Override
    public PgShdepend as(Name alias) {
        return new PgShdepend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdepend rename(String name) {
        return new PgShdepend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdepend rename(Name name) {
        return new PgShdepend(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, Integer, Long, Long, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}