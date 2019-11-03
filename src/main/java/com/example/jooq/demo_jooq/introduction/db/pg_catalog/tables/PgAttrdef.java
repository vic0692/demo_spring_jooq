/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgAttrdefRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class PgAttrdef extends TableImpl<PgAttrdefRecord> {

    private static final long serialVersionUID = 1601152297;

    /**
     * The reference instance of <code>pg_catalog.pg_attrdef</code>
     */
    public static final PgAttrdef PG_ATTRDEF = new PgAttrdef();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAttrdefRecord> getRecordType() {
        return PgAttrdefRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_attrdef.adrelid</code>.
     */
    public final TableField<PgAttrdefRecord, Long> ADRELID = createField(DSL.name("adrelid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attrdef.adnum</code>.
     */
    public final TableField<PgAttrdefRecord, Short> ADNUM = createField(DSL.name("adnum"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgAttrdefRecord, Object> ADBIN = createField(DSL.name("adbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * The column <code>pg_catalog.pg_attrdef.adsrc</code>.
     */
    public final TableField<PgAttrdefRecord, String> ADSRC = createField(DSL.name("adsrc"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef() {
        this(DSL.name("pg_attrdef"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef(String alias) {
        this(DSL.name(alias), PG_ATTRDEF);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef(Name alias) {
        this(alias, PG_ATTRDEF);
    }

    private PgAttrdef(Name alias, Table<PgAttrdefRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAttrdef(Name alias, Table<PgAttrdefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAttrdef(Table<O> child, ForeignKey<O, PgAttrdefRecord> key) {
        super(child, key, PG_ATTRDEF);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_ATTRDEF_ADRELID_ADNUM_INDEX);
    }

    @Override
    public PgAttrdef as(String alias) {
        return new PgAttrdef(DSL.name(alias), this);
    }

    @Override
    public PgAttrdef as(Name alias) {
        return new PgAttrdef(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttrdef rename(String name) {
        return new PgAttrdef(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttrdef rename(Name name) {
        return new PgAttrdef(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Short, Object, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
