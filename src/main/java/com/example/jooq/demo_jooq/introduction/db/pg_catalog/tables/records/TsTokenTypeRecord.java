/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.TsTokenType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TsTokenTypeRecord extends TableRecordImpl<TsTokenTypeRecord> implements Record6<Integer, Integer, String, String, String, String> {

    private static final long serialVersionUID = 1135292632;

    /**
     * Setter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public void setAlias(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public String getAlias() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public void setAlias(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public String getAlias() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TsTokenType.TS_TOKEN_TYPE.TOKID;
    }

    @Override
    public Field<Integer> field2() {
        return TsTokenType.TS_TOKEN_TYPE.TOKID;
    }

    @Override
    public Field<String> field3() {
        return TsTokenType.TS_TOKEN_TYPE.ALIAS;
    }

    @Override
    public Field<String> field4() {
        return TsTokenType.TS_TOKEN_TYPE.ALIAS;
    }

    @Override
    public Field<String> field5() {
        return TsTokenType.TS_TOKEN_TYPE.DESCRIPTION;
    }

    @Override
    public Field<String> field6() {
        return TsTokenType.TS_TOKEN_TYPE.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getTokid();
    }

    @Override
    public Integer component2() {
        return getTokid();
    }

    @Override
    public String component3() {
        return getAlias();
    }

    @Override
    public String component4() {
        return getAlias();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getTokid();
    }

    @Override
    public Integer value2() {
        return getTokid();
    }

    @Override
    public String value3() {
        return getAlias();
    }

    @Override
    public String value4() {
        return getAlias();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public TsTokenTypeRecord value1(Integer value) {
        setTokid(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value2(Integer value) {
        setTokid(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value3(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value4(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TsTokenTypeRecord
     */
    public TsTokenTypeRecord() {
        super(TsTokenType.TS_TOKEN_TYPE);
    }

    /**
     * Create a detached, initialised TsTokenTypeRecord
     */
    public TsTokenTypeRecord(Integer tokid, Integer tokid, String alias, String alias, String description, String description) {
        super(TsTokenType.TS_TOKEN_TYPE);

        set(0, tokid);
        set(1, tokid);
        set(2, alias);
        set(3, alias);
        set(4, description);
        set(5, description);
    }
}
