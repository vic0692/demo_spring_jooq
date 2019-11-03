/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgPreparedXactsRecord;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PgPreparedXacts extends TableImpl<PgPreparedXactsRecord> {

    private static final long serialVersionUID = -1445364282;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_xacts</code>
     */
    public static final PgPreparedXacts PG_PREPARED_XACTS = new PgPreparedXacts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedXactsRecord> getRecordType() {
        return PgPreparedXactsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public final TableField<PgPreparedXactsRecord, Long> TRANSACTION = createField(DSL.name("transaction"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> GID = createField(DSL.name("gid"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public final TableField<PgPreparedXactsRecord, OffsetDateTime> PREPARED = createField(DSL.name("prepared"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> OWNER = createField(DSL.name("owner"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> DATABASE = createField(DSL.name("database"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts() {
        this(DSL.name("pg_prepared_xacts"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts(String alias) {
        this(DSL.name(alias), PG_PREPARED_XACTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts(Name alias) {
        this(alias, PG_PREPARED_XACTS);
    }

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgPreparedXacts(Table<O> child, ForeignKey<O, PgPreparedXactsRecord> key) {
        super(child, key, PG_PREPARED_XACTS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPreparedXacts as(String alias) {
        return new PgPreparedXacts(DSL.name(alias), this);
    }

    @Override
    public PgPreparedXacts as(Name alias) {
        return new PgPreparedXacts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(String name) {
        return new PgPreparedXacts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(Name name) {
        return new PgPreparedXacts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, OffsetDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
