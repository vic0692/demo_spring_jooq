/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgPolicy;

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
public class PgPolicyRecord extends TableRecordImpl<PgPolicyRecord> implements Record7<String, Long, String, Boolean, Long[], Object, Object> {

    private static final long serialVersionUID = 973007045;

    /**
     * Setter for <code>pg_catalog.pg_policy.polname</code>.
     */
    public void setPolname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polname</code>.
     */
    public String getPolname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public void setPolrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public Long getPolrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public void setPolcmd(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public String getPolcmd() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public void setPolpermissive(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public Boolean getPolpermissive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polroles</code>.
     */
    public void setPolroles(Long... value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polroles</code>.
     */
    public Long[] getPolroles() {
        return (Long[]) get(4);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPolqual(Object value) {
        set(5, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPolqual() {
        return get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPolwithcheck(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPolwithcheck() {
        return get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Long, String, Boolean, Long[], Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Long, String, Boolean, Long[], Object, Object> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgPolicy.PG_POLICY.POLNAME;
    }

    @Override
    public Field<Long> field2() {
        return PgPolicy.PG_POLICY.POLRELID;
    }

    @Override
    public Field<String> field3() {
        return PgPolicy.PG_POLICY.POLCMD;
    }

    @Override
    public Field<Boolean> field4() {
        return PgPolicy.PG_POLICY.POLPERMISSIVE;
    }

    @Override
    public Field<Long[]> field5() {
        return PgPolicy.PG_POLICY.POLROLES;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field6() {
        return PgPolicy.PG_POLICY.POLQUAL;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return PgPolicy.PG_POLICY.POLWITHCHECK;
    }

    @Override
    public String component1() {
        return getPolname();
    }

    @Override
    public Long component2() {
        return getPolrelid();
    }

    @Override
    public String component3() {
        return getPolcmd();
    }

    @Override
    public Boolean component4() {
        return getPolpermissive();
    }

    @Override
    public Long[] component5() {
        return getPolroles();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component6() {
        return getPolqual();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getPolwithcheck();
    }

    @Override
    public String value1() {
        return getPolname();
    }

    @Override
    public Long value2() {
        return getPolrelid();
    }

    @Override
    public String value3() {
        return getPolcmd();
    }

    @Override
    public Boolean value4() {
        return getPolpermissive();
    }

    @Override
    public Long[] value5() {
        return getPolroles();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value6() {
        return getPolqual();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getPolwithcheck();
    }

    @Override
    public PgPolicyRecord value1(String value) {
        setPolname(value);
        return this;
    }

    @Override
    public PgPolicyRecord value2(Long value) {
        setPolrelid(value);
        return this;
    }

    @Override
    public PgPolicyRecord value3(String value) {
        setPolcmd(value);
        return this;
    }

    @Override
    public PgPolicyRecord value4(Boolean value) {
        setPolpermissive(value);
        return this;
    }

    @Override
    public PgPolicyRecord value5(Long... value) {
        setPolroles(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgPolicyRecord value6(Object value) {
        setPolqual(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgPolicyRecord value7(Object value) {
        setPolwithcheck(value);
        return this;
    }

    @Override
    public PgPolicyRecord values(String value1, Long value2, String value3, Boolean value4, Long[] value5, Object value6, Object value7) {
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
     * Create a detached PgPolicyRecord
     */
    public PgPolicyRecord() {
        super(PgPolicy.PG_POLICY);
    }

    /**
     * Create a detached, initialised PgPolicyRecord
     */
    public PgPolicyRecord(String polname, Long polrelid, String polcmd, Boolean polpermissive, Long[] polroles, Object polqual, Object polwithcheck) {
        super(PgPolicy.PG_POLICY);

        set(0, polname);
        set(1, polrelid);
        set(2, polcmd);
        set(3, polpermissive);
        set(4, polroles);
        set(5, polqual);
        set(6, polwithcheck);
    }
}
