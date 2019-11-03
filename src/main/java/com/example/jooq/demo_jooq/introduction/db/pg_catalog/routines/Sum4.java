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
public class Sum4 extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1870449249;

    /**
     * The parameter <code>pg_catalog.sum.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.REAL, false, false);

    /**
     * The parameter <code>pg_catalog.sum._1</code>.
     */
    public static final Parameter<Float> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.REAL, false, true);

    /**
     * Create a new routine call instance
     */
    public Sum4() {
        super("sum", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Float value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Float> field) {
        setField(_1, field);
    }
}
