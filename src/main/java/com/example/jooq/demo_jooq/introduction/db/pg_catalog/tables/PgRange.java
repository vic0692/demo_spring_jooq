/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgRangeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class PgRange extends TableImpl<PgRangeRecord> {

    private static final long serialVersionUID = 762498849;

    /**
     * The reference instance of <code>pg_catalog.pg_range</code>
     */
    public static final PgRange PG_RANGE = new PgRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRangeRecord> getRecordType() {
        return PgRangeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_range.rngtypid</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGTYPID = createField(DSL.name("rngtypid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubtype</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGSUBTYPE = createField(DSL.name("rngsubtype"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcollation</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGCOLLATION = createField(DSL.name("rngcollation"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubopc</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGSUBOPC = createField(DSL.name("rngsubopc"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcanonical</code>.
     */
    public final TableField<PgRangeRecord, String> RNGCANONICAL = createField(DSL.name("rngcanonical"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubdiff</code>.
     */
    public final TableField<PgRangeRecord, String> RNGSUBDIFF = createField(DSL.name("rngsubdiff"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange() {
        this(DSL.name("pg_range"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange(String alias) {
        this(DSL.name(alias), PG_RANGE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange(Name alias) {
        this(alias, PG_RANGE);
    }

    private PgRange(Name alias, Table<PgRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRange(Name alias, Table<PgRangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgRange(Table<O> child, ForeignKey<O, PgRangeRecord> key) {
        super(child, key, PG_RANGE);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_RANGE_RNGTYPID_INDEX);
    }

    @Override
    public PgRange as(String alias) {
        return new PgRange(DSL.name(alias), this);
    }

    @Override
    public PgRange as(Name alias) {
        return new PgRange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRange rename(String name) {
        return new PgRange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRange rename(Name name) {
        return new PgRange(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
