/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records.ConstraintColumnUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ConstraintColumnUsage extends TableImpl<ConstraintColumnUsageRecord> {

    private static final long serialVersionUID = -1331556024;

    /**
     * The reference instance of <code>information_schema.constraint_column_usage</code>
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new ConstraintColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstraintColumnUsageRecord> getRecordType() {
        return ConstraintColumnUsageRecord.class;
    }

    /**
     * The column <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.constraint_column_usage</code> table reference
     */
    public ConstraintColumnUsage() {
        this(DSL.name("constraint_column_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code> table reference
     */
    public ConstraintColumnUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code> table reference
     */
    public ConstraintColumnUsage(Name alias) {
        this(alias, CONSTRAINT_COLUMN_USAGE);
    }

    private ConstraintColumnUsage(Name alias, Table<ConstraintColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintColumnUsage(Name alias, Table<ConstraintColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ConstraintColumnUsage(Table<O> child, ForeignKey<O, ConstraintColumnUsageRecord> key) {
        super(child, key, CONSTRAINT_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ConstraintColumnUsage as(String alias) {
        return new ConstraintColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ConstraintColumnUsage as(Name alias) {
        return new ConstraintColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(String name) {
        return new ConstraintColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Name name) {
        return new ConstraintColumnUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
