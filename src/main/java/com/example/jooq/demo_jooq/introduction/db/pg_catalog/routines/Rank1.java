/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import javax.annotation.Generated;

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
public class Rank1 extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -390079960;

    /**
     * The parameter <code>pg_catalog.rank.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public Rank1() {
        super("rank", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
