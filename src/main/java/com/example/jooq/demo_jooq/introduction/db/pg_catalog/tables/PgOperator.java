/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgOperatorRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class PgOperator extends TableImpl<PgOperatorRecord> {

    private static final long serialVersionUID = 1103949579;

    /**
     * The reference instance of <code>pg_catalog.pg_operator</code>
     */
    public static final PgOperator PG_OPERATOR = new PgOperator();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOperatorRecord> getRecordType() {
        return PgOperatorRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_operator.oprname</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRNAME = createField(DSL.name("oprname"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRNAMESPACE = createField(DSL.name("oprnamespace"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPROWNER = createField(DSL.name("oprowner"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRKIND = createField(DSL.name("oprkind"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public final TableField<PgOperatorRecord, Boolean> OPRCANMERGE = createField(DSL.name("oprcanmerge"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public final TableField<PgOperatorRecord, Boolean> OPRCANHASH = createField(DSL.name("oprcanhash"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRLEFT = createField(DSL.name("oprleft"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprright</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRRIGHT = createField(DSL.name("oprright"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRRESULT = createField(DSL.name("oprresult"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRCOM = createField(DSL.name("oprcom"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRNEGATE = createField(DSL.name("oprnegate"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRCODE = createField(DSL.name("oprcode"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRREST = createField(DSL.name("oprrest"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRJOIN = createField(DSL.name("oprjoin"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator() {
        this(DSL.name("pg_operator"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(String alias) {
        this(DSL.name(alias), PG_OPERATOR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(Name alias) {
        this(alias, PG_OPERATOR);
    }

    private PgOperator(Name alias, Table<PgOperatorRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOperator(Name alias, Table<PgOperatorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgOperator(Table<O> child, ForeignKey<O, PgOperatorRecord> key) {
        super(child, key, PG_OPERATOR);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_OPERATOR_OPRNAME_L_R_N_INDEX);
    }

    @Override
    public PgOperator as(String alias) {
        return new PgOperator(DSL.name(alias), this);
    }

    @Override
    public PgOperator as(Name alias) {
        return new PgOperator(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOperator rename(String name) {
        return new PgOperator(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOperator rename(Name name) {
        return new PgOperator(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, Long, Long, String, Boolean, Boolean, Long, Long, Long, Long, Long, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
