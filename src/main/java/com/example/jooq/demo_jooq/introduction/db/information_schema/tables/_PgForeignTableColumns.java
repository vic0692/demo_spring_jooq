/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records._PgForeignTableColumnsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class _PgForeignTableColumns extends TableImpl<_PgForeignTableColumnsRecord> {

    private static final long serialVersionUID = -286711804;

    /**
     * The reference instance of <code>information_schema._pg_foreign_table_columns</code>
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = new _PgForeignTableColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignTableColumnsRecord> getRecordType() {
        return _PgForeignTableColumnsRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> NSPNAME = createField(DSL.name("nspname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> RELNAME = createField(DSL.name("relname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> ATTNAME = createField(DSL.name("attname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String[]> ATTFDWOPTIONS = createField(DSL.name("attfdwoptions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns() {
        this(DSL.name("_pg_foreign_table_columns"), null);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(Name alias) {
        this(alias, _PG_FOREIGN_TABLE_COLUMNS);
    }

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> _PgForeignTableColumns(Table<O> child, ForeignKey<O, _PgForeignTableColumnsRecord> key) {
        super(child, key, _PG_FOREIGN_TABLE_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignTableColumns as(String alias) {
        return new _PgForeignTableColumns(DSL.name(alias), this);
    }

    @Override
    public _PgForeignTableColumns as(Name alias) {
        return new _PgForeignTableColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTableColumns rename(String name) {
        return new _PgForeignTableColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTableColumns rename(Name name) {
        return new _PgForeignTableColumns(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
