/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import java.sql.Timestamp;

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
public class MakeTimestamp extends AbstractRoutine<Timestamp> {

    private static final long serialVersionUID = 2119085778;

    /**
     * The parameter <code>pg_catalog.make_timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<Timestamp> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.year</code>.
     */
    public static final Parameter<Integer> YEAR = Internal.createParameter("year", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.month</code>.
     */
    public static final Parameter<Integer> MONTH = Internal.createParameter("month", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.mday</code>.
     */
    public static final Parameter<Integer> MDAY = Internal.createParameter("mday", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.hour</code>.
     */
    public static final Parameter<Integer> HOUR = Internal.createParameter("hour", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.min</code>.
     */
    public static final Parameter<Integer> MIN = Internal.createParameter("min", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_timestamp.sec</code>.
     */
    public static final Parameter<Double> SEC = Internal.createParameter("sec", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeTimestamp() {
        super("make_timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMP);

        setReturnParameter(RETURN_VALUE);
        addInParameter(YEAR);
        addInParameter(MONTH);
        addInParameter(MDAY);
        addInParameter(HOUR);
        addInParameter(MIN);
        addInParameter(SEC);
    }

    /**
     * Set the <code>year</code> parameter IN value to the routine
     */
    public void setYear(Integer value) {
        setValue(YEAR, value);
    }

    /**
     * Set the <code>year</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setYear(Field<Integer> field) {
        setField(YEAR, field);
    }

    /**
     * Set the <code>month</code> parameter IN value to the routine
     */
    public void setMonth(Integer value) {
        setValue(MONTH, value);
    }

    /**
     * Set the <code>month</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMonth(Field<Integer> field) {
        setField(MONTH, field);
    }

    /**
     * Set the <code>mday</code> parameter IN value to the routine
     */
    public void setMday(Integer value) {
        setValue(MDAY, value);
    }

    /**
     * Set the <code>mday</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMday(Field<Integer> field) {
        setField(MDAY, field);
    }

    /**
     * Set the <code>hour</code> parameter IN value to the routine
     */
    public void setHour(Integer value) {
        setValue(HOUR, value);
    }

    /**
     * Set the <code>hour</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHour(Field<Integer> field) {
        setField(HOUR, field);
    }

    /**
     * Set the <code>min</code> parameter IN value to the routine
     */
    public void setMin(Integer value) {
        setValue(MIN, value);
    }

    /**
     * Set the <code>min</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMin(Field<Integer> field) {
        setField(MIN, field);
    }

    /**
     * Set the <code>sec</code> parameter IN value to the routine
     */
    public void setSec(Double value) {
        setValue(SEC, value);
    }

    /**
     * Set the <code>sec</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSec(Field<Double> field) {
        setField(SEC, field);
    }
}
