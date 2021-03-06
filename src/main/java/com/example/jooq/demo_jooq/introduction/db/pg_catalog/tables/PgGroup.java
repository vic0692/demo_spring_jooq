/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgGroupRecord;

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
public class PgGroup extends TableImpl<PgGroupRecord> {

    private static final long serialVersionUID = -1644783325;

    /**
     * The reference instance of <code>pg_catalog.pg_group</code>
     */
    public static final PgGroup PG_GROUP = new PgGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGroupRecord> getRecordType() {
        return PgGroupRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_group.groname</code>.
     */
    public final TableField<PgGroupRecord, String> GRONAME = createField(DSL.name("groname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_group.grosysid</code>.
     */
    public final TableField<PgGroupRecord, Long> GROSYSID = createField(DSL.name("grosysid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_group.grolist</code>.
     */
    public final TableField<PgGroupRecord, Long[]> GROLIST = createField(DSL.name("grolist"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup() {
        this(DSL.name("pg_group"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup(String alias) {
        this(DSL.name(alias), PG_GROUP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup(Name alias) {
        this(alias, PG_GROUP);
    }

    private PgGroup(Name alias, Table<PgGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgGroup(Name alias, Table<PgGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgGroup(Table<O> child, ForeignKey<O, PgGroupRecord> key) {
        super(child, key, PG_GROUP);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGroup as(String alias) {
        return new PgGroup(DSL.name(alias), this);
    }

    @Override
    public PgGroup as(Name alias) {
        return new PgGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGroup rename(String name) {
        return new PgGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGroup rename(Name name) {
        return new PgGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, Long[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
