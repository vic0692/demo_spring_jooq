/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgStatSsl;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PgStatSslRecord extends TableRecordImpl<PgStatSslRecord> implements Record7<Integer, Boolean, String, String, Integer, Boolean, String> {

    private static final long serialVersionUID = -1431375048;

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public void setSsl(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public Boolean getSsl() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public void setVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public void setCipher(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public String getCipher() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public void setBits(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public Integer getBits() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.compression</code>.
     */
    public void setCompression(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.compression</code>.
     */
    public Boolean getCompression() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.clientdn</code>.
     */
    public void setClientdn(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.clientdn</code>.
     */
    public String getClientdn() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Boolean, String, String, Integer, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Boolean, String, String, Integer, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatSsl.PG_STAT_SSL.PID;
    }

    @Override
    public Field<Boolean> field2() {
        return PgStatSsl.PG_STAT_SSL.SSL;
    }

    @Override
    public Field<String> field3() {
        return PgStatSsl.PG_STAT_SSL.VERSION;
    }

    @Override
    public Field<String> field4() {
        return PgStatSsl.PG_STAT_SSL.CIPHER;
    }

    @Override
    public Field<Integer> field5() {
        return PgStatSsl.PG_STAT_SSL.BITS;
    }

    @Override
    public Field<Boolean> field6() {
        return PgStatSsl.PG_STAT_SSL.COMPRESSION;
    }

    @Override
    public Field<String> field7() {
        return PgStatSsl.PG_STAT_SSL.CLIENTDN;
    }

    @Override
    public Integer component1() {
        return getPid();
    }

    @Override
    public Boolean component2() {
        return getSsl();
    }

    @Override
    public String component3() {
        return getVersion();
    }

    @Override
    public String component4() {
        return getCipher();
    }

    @Override
    public Integer component5() {
        return getBits();
    }

    @Override
    public Boolean component6() {
        return getCompression();
    }

    @Override
    public String component7() {
        return getClientdn();
    }

    @Override
    public Integer value1() {
        return getPid();
    }

    @Override
    public Boolean value2() {
        return getSsl();
    }

    @Override
    public String value3() {
        return getVersion();
    }

    @Override
    public String value4() {
        return getCipher();
    }

    @Override
    public Integer value5() {
        return getBits();
    }

    @Override
    public Boolean value6() {
        return getCompression();
    }

    @Override
    public String value7() {
        return getClientdn();
    }

    @Override
    public PgStatSslRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatSslRecord value2(Boolean value) {
        setSsl(value);
        return this;
    }

    @Override
    public PgStatSslRecord value3(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PgStatSslRecord value4(String value) {
        setCipher(value);
        return this;
    }

    @Override
    public PgStatSslRecord value5(Integer value) {
        setBits(value);
        return this;
    }

    @Override
    public PgStatSslRecord value6(Boolean value) {
        setCompression(value);
        return this;
    }

    @Override
    public PgStatSslRecord value7(String value) {
        setClientdn(value);
        return this;
    }

    @Override
    public PgStatSslRecord values(Integer value1, Boolean value2, String value3, String value4, Integer value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSslRecord
     */
    public PgStatSslRecord() {
        super(PgStatSsl.PG_STAT_SSL);
    }

    /**
     * Create a detached, initialised PgStatSslRecord
     */
    public PgStatSslRecord(Integer pid, Boolean ssl, String version, String cipher, Integer bits, Boolean compression, String clientdn) {
        super(PgStatSsl.PG_STAT_SSL);

        set(0, pid);
        set(1, ssl);
        set(2, version);
        set(3, cipher);
        set(4, bits);
        set(5, compression);
        set(6, clientdn);
    }
}
