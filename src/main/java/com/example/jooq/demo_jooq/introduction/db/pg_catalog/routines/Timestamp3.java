/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import java.sql.Date;
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
public class Timestamp3 extends AbstractRoutine<Timestamp> {

    private static final long serialVersionUID = 429484980;

    /**
     * The parameter <code>pg_catalog.timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<Timestamp> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>pg_catalog.timestamp._1</code>.
     */
    public static final Parameter<Date> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.DATE, false, true);

    /**
     * Create a new routine call instance
     */
    public Timestamp3() {
        super("timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMP);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Date value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Date> field) {
        setField(_1, field);
    }
}
