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
public class Length6 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 482780190;

    /**
     * The parameter <code>pg_catalog.length.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.length._1</code>.
     */
    public static final Parameter<byte[]> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.BLOB, false, true);

    /**
     * The parameter <code>pg_catalog.length._2</code>.
     */
    public static final Parameter<String> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.VARCHAR, false, true);

    /**
     * Create a new routine call instance
     */
    public Length6() {
        super("length", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(byte... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<byte[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<String> field) {
        setField(_2, field);
    }
}