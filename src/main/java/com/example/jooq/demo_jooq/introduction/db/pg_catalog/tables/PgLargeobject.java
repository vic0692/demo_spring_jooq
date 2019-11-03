/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgLargeobjectRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgLargeobject extends TableImpl<PgLargeobjectRecord> {

    private static final long serialVersionUID = 1954822573;

    /**
     * The reference instance of <code>pg_catalog.pg_largeobject</code>
     */
    public static final PgLargeobject PG_LARGEOBJECT = new PgLargeobject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLargeobjectRecord> getRecordType() {
        return PgLargeobjectRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public final TableField<PgLargeobjectRecord, Long> LOID = createField(DSL.name("loid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public final TableField<PgLargeobjectRecord, Integer> PAGENO = createField(DSL.name("pageno"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.data</code>.
     */
    public final TableField<PgLargeobjectRecord, byte[]> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject() {
        this(DSL.name("pg_largeobject"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject(String alias) {
        this(DSL.name(alias), PG_LARGEOBJECT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject(Name alias) {
        this(alias, PG_LARGEOBJECT);
    }

    private PgLargeobject(Name alias, Table<PgLargeobjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLargeobject(Name alias, Table<PgLargeobjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgLargeobject(Table<O> child, ForeignKey<O, PgLargeobjectRecord> key) {
        super(child, key, PG_LARGEOBJECT);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_LARGEOBJECT_LOID_PN_INDEX);
    }

    @Override
    public PgLargeobject as(String alias) {
        return new PgLargeobject(DSL.name(alias), this);
    }

    @Override
    public PgLargeobject as(Name alias) {
        return new PgLargeobject(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLargeobject rename(String name) {
        return new PgLargeobject(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLargeobject rename(Name name) {
        return new PgLargeobject(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Integer, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
