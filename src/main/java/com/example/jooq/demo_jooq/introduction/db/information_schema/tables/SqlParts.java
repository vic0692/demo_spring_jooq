/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records.SqlPartsRecord;

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
public class SqlParts extends TableImpl<SqlPartsRecord> {

    private static final long serialVersionUID = 1253472749;

    /**
     * The reference instance of <code>information_schema.sql_parts</code>
     */
    public static final SqlParts SQL_PARTS = new SqlParts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlPartsRecord> getRecordType() {
        return SqlPartsRecord.class;
    }

    /**
     * The column <code>information_schema.sql_parts.feature_id</code>.
     */
    public final TableField<SqlPartsRecord, String> FEATURE_ID = createField(DSL.name("feature_id"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_parts.feature_name</code>.
     */
    public final TableField<SqlPartsRecord, String> FEATURE_NAME = createField(DSL.name("feature_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_parts.is_supported</code>.
     */
    public final TableField<SqlPartsRecord, String> IS_SUPPORTED = createField(DSL.name("is_supported"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public final TableField<SqlPartsRecord, String> IS_VERIFIED_BY = createField(DSL.name("is_verified_by"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_parts.comments</code>.
     */
    public final TableField<SqlPartsRecord, String> COMMENTS = createField(DSL.name("comments"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_parts</code> table reference
     */
    public SqlParts() {
        this(DSL.name("sql_parts"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_parts</code> table reference
     */
    public SqlParts(String alias) {
        this(DSL.name(alias), SQL_PARTS);
    }

    /**
     * Create an aliased <code>information_schema.sql_parts</code> table reference
     */
    public SqlParts(Name alias) {
        this(alias, SQL_PARTS);
    }

    private SqlParts(Name alias, Table<SqlPartsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlParts(Name alias, Table<SqlPartsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SqlParts(Table<O> child, ForeignKey<O, SqlPartsRecord> key) {
        super(child, key, SQL_PARTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SqlParts as(String alias) {
        return new SqlParts(DSL.name(alias), this);
    }

    @Override
    public SqlParts as(Name alias) {
        return new SqlParts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlParts rename(String name) {
        return new SqlParts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlParts rename(Name name) {
        return new SqlParts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
