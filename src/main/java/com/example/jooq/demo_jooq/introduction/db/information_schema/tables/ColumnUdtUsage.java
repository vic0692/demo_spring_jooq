/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records.ColumnUdtUsageRecord;

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
public class ColumnUdtUsage extends TableImpl<ColumnUdtUsageRecord> {

    private static final long serialVersionUID = -1358689080;

    /**
     * The reference instance of <code>information_schema.column_udt_usage</code>
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = new ColumnUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnUdtUsageRecord> getRecordType() {
        return ColumnUdtUsageRecord.class;
    }

    /**
     * The column <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_udt_usage.column_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage() {
        this(DSL.name("column_udt_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage(String alias) {
        this(DSL.name(alias), COLUMN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage(Name alias) {
        this(alias, COLUMN_UDT_USAGE);
    }

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ColumnUdtUsage(Table<O> child, ForeignKey<O, ColumnUdtUsageRecord> key) {
        super(child, key, COLUMN_UDT_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnUdtUsage as(String alias) {
        return new ColumnUdtUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnUdtUsage as(Name alias) {
        return new ColumnUdtUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(String name) {
        return new ColumnUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Name name) {
        return new ColumnUdtUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
