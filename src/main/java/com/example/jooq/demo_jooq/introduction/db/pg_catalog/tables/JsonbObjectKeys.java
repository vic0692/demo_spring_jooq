/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.JsonbObjectKeysRecord;

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
public class JsonbObjectKeys extends TableImpl<JsonbObjectKeysRecord> {

    private static final long serialVersionUID = 308533845;

    /**
     * The reference instance of <code>pg_catalog.jsonb_object_keys</code>
     */
    public static final JsonbObjectKeys JSONB_OBJECT_KEYS = new JsonbObjectKeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbObjectKeysRecord> getRecordType() {
        return JsonbObjectKeysRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_object_keys.jsonb_object_keys</code>.
     */
    public final TableField<JsonbObjectKeysRecord, String> JSONB_OBJECT_KEYS_ = createField(DSL.name("jsonb_object_keys"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.jsonb_object_keys</code> table reference
     */
    public JsonbObjectKeys() {
        this(DSL.name("jsonb_object_keys"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_object_keys</code> table reference
     */
    public JsonbObjectKeys(String alias) {
        this(DSL.name(alias), JSONB_OBJECT_KEYS);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_object_keys</code> table reference
     */
    public JsonbObjectKeys(Name alias) {
        this(alias, JSONB_OBJECT_KEYS);
    }

    private JsonbObjectKeys(Name alias, Table<JsonbObjectKeysRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonbObjectKeys(Name alias, Table<JsonbObjectKeysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonbObjectKeys(Table<O> child, ForeignKey<O, JsonbObjectKeysRecord> key) {
        super(child, key, JSONB_OBJECT_KEYS);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbObjectKeys as(String alias) {
        return new JsonbObjectKeys(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbObjectKeys as(Name alias) {
        return new JsonbObjectKeys(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbObjectKeys rename(String name) {
        return new JsonbObjectKeys(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbObjectKeys rename(Name name) {
        return new JsonbObjectKeys(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonbObjectKeys call(JSONB __1) {
        return new JsonbObjectKeys(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.JSONB)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonbObjectKeys call(Field<JSONB> __1) {
        return new JsonbObjectKeys(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}