/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgGetPublicationTablesRecord;

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
public class PgGetPublicationTables extends TableImpl<PgGetPublicationTablesRecord> {

    private static final long serialVersionUID = -1631381112;

    /**
     * The reference instance of <code>pg_catalog.pg_get_publication_tables</code>
     */
    public static final PgGetPublicationTables PG_GET_PUBLICATION_TABLES = new PgGetPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetPublicationTablesRecord> getRecordType() {
        return PgGetPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> RELID = createField(DSL.name("relid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_get_publication_tables</code> table reference
     */
    public PgGetPublicationTables() {
        this(DSL.name("pg_get_publication_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table reference
     */
    public PgGetPublicationTables(String alias) {
        this(DSL.name(alias), PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table reference
     */
    public PgGetPublicationTables(Name alias) {
        this(alias, PG_GET_PUBLICATION_TABLES);
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgGetPublicationTables(Table<O> child, ForeignKey<O, PgGetPublicationTablesRecord> key) {
        super(child, key, PG_GET_PUBLICATION_TABLES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetPublicationTables as(String alias) {
        return new PgGetPublicationTables(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetPublicationTables as(Name alias) {
        return new PgGetPublicationTables(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(String name) {
        return new PgGetPublicationTables(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(Name name) {
        return new PgGetPublicationTables(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(String pubname) {
        return new PgGetPublicationTables(DSL.name(getName()), null, new Field[] { 
              DSL.val(pubname, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(Field<String> pubname) {
        return new PgGetPublicationTables(DSL.name(getName()), null, new Field[] { 
              pubname
        });
    }
}
