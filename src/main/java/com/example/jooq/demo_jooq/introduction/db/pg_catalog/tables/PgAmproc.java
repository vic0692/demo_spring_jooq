/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgAmprocRecord;

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
public class PgAmproc extends TableImpl<PgAmprocRecord> {

    private static final long serialVersionUID = 1567851744;

    /**
     * The reference instance of <code>pg_catalog.pg_amproc</code>
     */
    public static final PgAmproc PG_AMPROC = new PgAmproc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAmprocRecord> getRecordType() {
        return PgAmprocRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_amproc.amprocfamily</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCFAMILY = createField(DSL.name("amprocfamily"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amproclefttype</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCLEFTTYPE = createField(DSL.name("amproclefttype"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amprocrighttype</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCRIGHTTYPE = createField(DSL.name("amprocrighttype"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amprocnum</code>.
     */
    public final TableField<PgAmprocRecord, Short> AMPROCNUM = createField(DSL.name("amprocnum"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amproc</code>.
     */
    public final TableField<PgAmprocRecord, String> AMPROC = createField(DSL.name("amproc"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc() {
        this(DSL.name("pg_amproc"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc(String alias) {
        this(DSL.name(alias), PG_AMPROC);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc(Name alias) {
        this(alias, PG_AMPROC);
    }

    private PgAmproc(Name alias, Table<PgAmprocRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAmproc(Name alias, Table<PgAmprocRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAmproc(Table<O> child, ForeignKey<O, PgAmprocRecord> key) {
        super(child, key, PG_AMPROC);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_AMPROC_FAM_PROC_INDEX);
    }

    @Override
    public PgAmproc as(String alias) {
        return new PgAmproc(DSL.name(alias), this);
    }

    @Override
    public PgAmproc as(Name alias) {
        return new PgAmproc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmproc rename(String name) {
        return new PgAmproc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmproc rename(Name name) {
        return new PgAmproc(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, Short, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
