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
public class PgEventTriggerTableRewriteOid extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 170344711;

    /**
     * The parameter <code>pg_catalog.pg_event_trigger_table_rewrite_oid.oid</code>.
     */
    public static final Parameter<Long> OID = Internal.createParameter("oid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgEventTriggerTableRewriteOid() {
        super("pg_event_trigger_table_rewrite_oid", PgCatalog.PG_CATALOG);

        addOutParameter(OID);
    }

    /**
     * Get the <code>oid</code> parameter OUT value from the routine
     */
    public Long getOid() {
        return get(OID);
    }
}
