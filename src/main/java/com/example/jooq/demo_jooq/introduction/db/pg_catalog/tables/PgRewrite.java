/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgRewriteRecord;

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
public class PgRewrite extends TableImpl<PgRewriteRecord> {

    private static final long serialVersionUID = 927128382;

    /**
     * The reference instance of <code>pg_catalog.pg_rewrite</code>
     */
    public static final PgRewrite PG_REWRITE = new PgRewrite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRewriteRecord> getRecordType() {
        return PgRewriteRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public final TableField<PgRewriteRecord, String> RULENAME = createField(DSL.name("rulename"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public final TableField<PgRewriteRecord, Long> EV_CLASS = createField(DSL.name("ev_class"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public final TableField<PgRewriteRecord, String> EV_TYPE = createField(DSL.name("ev_type"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public final TableField<PgRewriteRecord, String> EV_ENABLED = createField(DSL.name("ev_enabled"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public final TableField<PgRewriteRecord, Boolean> IS_INSTEAD = createField(DSL.name("is_instead"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgRewriteRecord, Object> EV_QUAL = createField(DSL.name("ev_qual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgRewriteRecord, Object> EV_ACTION = createField(DSL.name("ev_action"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * Create a <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite() {
        this(DSL.name("pg_rewrite"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite(String alias) {
        this(DSL.name(alias), PG_REWRITE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite(Name alias) {
        this(alias, PG_REWRITE);
    }

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgRewrite(Table<O> child, ForeignKey<O, PgRewriteRecord> key) {
        super(child, key, PG_REWRITE);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_REWRITE_REL_RULENAME_INDEX);
    }

    @Override
    public PgRewrite as(String alias) {
        return new PgRewrite(DSL.name(alias), this);
    }

    @Override
    public PgRewrite as(Name alias) {
        return new PgRewrite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRewrite rename(String name) {
        return new PgRewrite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRewrite rename(Name name) {
        return new PgRewrite(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Long, String, String, Boolean, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
