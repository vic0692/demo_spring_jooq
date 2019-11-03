/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgSubscriptionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class PgSubscription extends TableImpl<PgSubscriptionRecord> {

    private static final long serialVersionUID = -1615134454;

    /**
     * The reference instance of <code>pg_catalog.pg_subscription</code>
     */
    public static final PgSubscription PG_SUBSCRIPTION = new PgSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSubscriptionRecord> getRecordType() {
        return PgSubscriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_subscription.subdbid</code>.
     */
    public final TableField<PgSubscriptionRecord, Long> SUBDBID = createField(DSL.name("subdbid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subname</code>.
     */
    public final TableField<PgSubscriptionRecord, String> SUBNAME = createField(DSL.name("subname"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subowner</code>.
     */
    public final TableField<PgSubscriptionRecord, Long> SUBOWNER = createField(DSL.name("subowner"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subenabled</code>.
     */
    public final TableField<PgSubscriptionRecord, Boolean> SUBENABLED = createField(DSL.name("subenabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subconninfo</code>.
     */
    public final TableField<PgSubscriptionRecord, String> SUBCONNINFO = createField(DSL.name("subconninfo"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subslotname</code>.
     */
    public final TableField<PgSubscriptionRecord, String> SUBSLOTNAME = createField(DSL.name("subslotname"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subsynccommit</code>.
     */
    public final TableField<PgSubscriptionRecord, String> SUBSYNCCOMMIT = createField(DSL.name("subsynccommit"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subpublications</code>.
     */
    public final TableField<PgSubscriptionRecord, String[]> SUBPUBLICATIONS = createField(DSL.name("subpublications"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription() {
        this(DSL.name("pg_subscription"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription(String alias) {
        this(DSL.name(alias), PG_SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription(Name alias) {
        this(alias, PG_SUBSCRIPTION);
    }

    private PgSubscription(Name alias, Table<PgSubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSubscription(Name alias, Table<PgSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgSubscription(Table<O> child, ForeignKey<O, PgSubscriptionRecord> key) {
        super(child, key, PG_SUBSCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_SUBSCRIPTION_SUBNAME_INDEX);
    }

    @Override
    public PgSubscription as(String alias) {
        return new PgSubscription(DSL.name(alias), this);
    }

    @Override
    public PgSubscription as(Name alias) {
        return new PgSubscription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscription rename(String name) {
        return new PgSubscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscription rename(Name name) {
        return new PgSubscription(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, Boolean, String, String, String, String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}