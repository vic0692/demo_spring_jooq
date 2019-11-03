/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgShdescriptionRecord;

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
public class PgShdescription extends TableImpl<PgShdescriptionRecord> {

    private static final long serialVersionUID = 2127104534;

    /**
     * The reference instance of <code>pg_catalog.pg_shdescription</code>
     */
    public static final PgShdescription PG_SHDESCRIPTION = new PgShdescription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShdescriptionRecord> getRecordType() {
        return PgShdescriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shdescription.objoid</code>.
     */
    public final TableField<PgShdescriptionRecord, Long> OBJOID = createField(DSL.name("objoid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdescription.classoid</code>.
     */
    public final TableField<PgShdescriptionRecord, Long> CLASSOID = createField(DSL.name("classoid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shdescription.description</code>.
     */
    public final TableField<PgShdescriptionRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_shdescription</code> table reference
     */
    public PgShdescription() {
        this(DSL.name("pg_shdescription"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdescription</code> table reference
     */
    public PgShdescription(String alias) {
        this(DSL.name(alias), PG_SHDESCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shdescription</code> table reference
     */
    public PgShdescription(Name alias) {
        this(alias, PG_SHDESCRIPTION);
    }

    private PgShdescription(Name alias, Table<PgShdescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShdescription(Name alias, Table<PgShdescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgShdescription(Table<O> child, ForeignKey<O, PgShdescriptionRecord> key) {
        super(child, key, PG_SHDESCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_SHDESCRIPTION_O_C_INDEX);
    }

    @Override
    public PgShdescription as(String alias) {
        return new PgShdescription(DSL.name(alias), this);
    }

    @Override
    public PgShdescription as(Name alias) {
        return new PgShdescription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdescription rename(String name) {
        return new PgShdescription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShdescription rename(Name name) {
        return new PgShdescription(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
