/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainRecv extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1643679896;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * The parameter <code>pg_catalog.domain_recv._2</code>.
     */
    public static final Parameter<Long> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.domain_recv._3</code>.
     */
    public static final Parameter<Integer> _3 = Internal.createParameter("_3", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public DomainRecv() {
        super("domain_recv", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.OTHER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Integer value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Integer> field) {
        setField(_3, field);
    }
}
