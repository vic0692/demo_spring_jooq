/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records.SchemataRecord;

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
public class Schemata extends TableImpl<SchemataRecord> {

    private static final long serialVersionUID = 1922552732;

    /**
     * The reference instance of <code>information_schema.schemata</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemataRecord> getRecordType() {
        return SchemataRecord.class;
    }

    /**
     * The column <code>information_schema.schemata.catalog_name</code>.
     */
    public final TableField<SchemataRecord, String> CATALOG_NAME = createField(DSL.name("catalog_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.schema_name</code>.
     */
    public final TableField<SchemataRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.schema_owner</code>.
     */
    public final TableField<SchemataRecord, String> SCHEMA_OWNER = createField(DSL.name("schema_owner"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_CATALOG = createField(DSL.name("default_character_set_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_SCHEMA = createField(DSL.name("default_character_set_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.default_character_set_name</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("default_character_set_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.schemata.sql_path</code>.
     */
    public final TableField<SchemataRecord, String> SQL_PATH = createField(DSL.name("sql_path"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.schemata</code> table reference
     */
    public Schemata() {
        this(DSL.name("schemata"), null);
    }

    /**
     * Create an aliased <code>information_schema.schemata</code> table reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>information_schema.schemata</code> table reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Schemata(Table<O> child, ForeignKey<O, SchemataRecord> key) {
        super(child, key, SCHEMATA);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
