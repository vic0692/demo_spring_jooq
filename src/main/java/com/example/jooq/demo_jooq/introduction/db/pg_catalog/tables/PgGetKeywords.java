/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgGetKeywordsRecord;

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
public class PgGetKeywords extends TableImpl<PgGetKeywordsRecord> {

    private static final long serialVersionUID = -787239577;

    /**
     * The reference instance of <code>pg_catalog.pg_get_keywords</code>
     */
    public static final PgGetKeywords PG_GET_KEYWORDS = new PgGetKeywords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetKeywordsRecord> getRecordType() {
        return PgGetKeywordsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_keywords.word</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> WORD = createField(DSL.name("word"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.catcode</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> CATCODE = createField(DSL.name("catcode"), org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.catdesc</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> CATDESC = createField(DSL.name("catdesc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords() {
        this(DSL.name("pg_get_keywords"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords(String alias) {
        this(DSL.name(alias), PG_GET_KEYWORDS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords(Name alias) {
        this(alias, PG_GET_KEYWORDS);
    }

    private PgGetKeywords(Name alias, Table<PgGetKeywordsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgGetKeywords(Name alias, Table<PgGetKeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgGetKeywords(Table<O> child, ForeignKey<O, PgGetKeywordsRecord> key) {
        super(child, key, PG_GET_KEYWORDS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetKeywords as(String alias) {
        return new PgGetKeywords(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetKeywords as(Name alias) {
        return new PgGetKeywords(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetKeywords rename(String name) {
        return new PgGetKeywords(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetKeywords rename(Name name) {
        return new PgGetKeywords(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetKeywords call() {
        return new PgGetKeywords(DSL.name(getName()), null, new Field[] { 
        });
    }
}