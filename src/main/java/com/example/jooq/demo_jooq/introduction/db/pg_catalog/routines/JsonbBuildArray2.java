/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.JSONB;
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
public class JsonbBuildArray2 extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = -1593968779;

    /**
     * The parameter <code>pg_catalog.jsonb_build_array.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbBuildArray2() {
        super("jsonb_build_array", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
