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
public class Dlog1 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 597150644;

    /**
     * The parameter <code>pg_catalog.dlog1.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>pg_catalog.dlog1._1</code>.
     */
    public static final Parameter<Double> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * Create a new routine call instance
     */
    public Dlog1() {
        super("dlog1", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double> field) {
        setField(_1, field);
    }
}
