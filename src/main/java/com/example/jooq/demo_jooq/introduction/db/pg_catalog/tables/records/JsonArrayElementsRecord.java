/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.JsonArrayElements;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class JsonArrayElementsRecord extends TableRecordImpl<JsonArrayElementsRecord> implements Record1<JSON> {

    private static final long serialVersionUID = -1002259042;

    /**
     * Setter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public void setValue(JSON value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public JSON getValue() {
        return (JSON) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<JSON> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<JSON> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<JSON> field1() {
        return JsonArrayElements.JSON_ARRAY_ELEMENTS.VALUE;
    }

    @Override
    public JSON component1() {
        return getValue();
    }

    @Override
    public JSON value1() {
        return getValue();
    }

    @Override
    public JsonArrayElementsRecord value1(JSON value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonArrayElementsRecord values(JSON value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord() {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create a detached, initialised JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord(JSON value) {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);

        set(0, value);
    }
}
