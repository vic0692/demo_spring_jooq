/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.routines;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;

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
public class _PgKeysequal extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -308677242;

    /**
     * The parameter <code>information_schema._pg_keysequal.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>information_schema._pg_keysequal._1</code>.
     */
    public static final Parameter<Short[]> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), false, true);

    /**
     * The parameter <code>information_schema._pg_keysequal._2</code>.
     */
    public static final Parameter<Short[]> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public _PgKeysequal() {
        super("_pg_keysequal", InformationSchema.INFORMATION_SCHEMA, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Short... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Short[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Short... value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Short[]> field) {
        setField(_2, field);
    }
}
