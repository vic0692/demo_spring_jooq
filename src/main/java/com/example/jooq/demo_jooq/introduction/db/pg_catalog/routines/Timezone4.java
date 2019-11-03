/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import java.time.OffsetTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.types.YearToSecond;


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
public class Timezone4 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = 884818283;

    /**
     * The parameter <code>pg_catalog.timezone.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.timezone._1</code>.
     */
    public static final Parameter<YearToSecond> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.INTERVAL, false, true);

    /**
     * The parameter <code>pg_catalog.timezone._2</code>.
     */
    public static final Parameter<OffsetTime> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, true);

    /**
     * Create a new routine call instance
     */
    public Timezone4() {
        super("timezone", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(YearToSecond value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<YearToSecond> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(OffsetTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<OffsetTime> field) {
        setField(_2, field);
    }
}
