/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.JsonbArrayElementsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class JsonbArrayElements extends TableImpl<JsonbArrayElementsRecord> {

    private static final long serialVersionUID = -192240699;

    /**
     * The reference instance of <code>pg_catalog.jsonb_array_elements</code>
     */
    public static final JsonbArrayElements JSONB_ARRAY_ELEMENTS = new JsonbArrayElements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbArrayElementsRecord> getRecordType() {
        return JsonbArrayElementsRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_array_elements.value</code>.
     */
    public final TableField<JsonbArrayElementsRecord, JSONB> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.JSONB, this, "");

    /**
     * Create a <code>pg_catalog.jsonb_array_elements</code> table reference
     */
    public JsonbArrayElements() {
        this(DSL.name("jsonb_array_elements"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table reference
     */
    public JsonbArrayElements(String alias) {
        this(DSL.name(alias), JSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table reference
     */
    public JsonbArrayElements(Name alias) {
        this(alias, JSONB_ARRAY_ELEMENTS);
    }

    private JsonbArrayElements(Name alias, Table<JsonbArrayElementsRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonbArrayElements(Name alias, Table<JsonbArrayElementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonbArrayElements(Table<O> child, ForeignKey<O, JsonbArrayElementsRecord> key) {
        super(child, key, JSONB_ARRAY_ELEMENTS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbArrayElements as(String alias) {
        return new JsonbArrayElements(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbArrayElements as(Name alias) {
        return new JsonbArrayElements(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbArrayElements rename(String name) {
        return new JsonbArrayElements(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbArrayElements rename(Name name) {
        return new JsonbArrayElements(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<JSONB> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonbArrayElements call(JSONB fromJson) {
        return new JsonbArrayElements(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.SQLDataType.JSONB)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonbArrayElements call(Field<JSONB> fromJson) {
        return new JsonbArrayElements(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}