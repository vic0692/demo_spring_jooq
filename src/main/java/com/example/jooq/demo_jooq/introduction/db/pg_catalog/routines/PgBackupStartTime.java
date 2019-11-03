/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.routines;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class PgBackupStartTime extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = -2054771066;

    /**
     * The parameter <code>pg_catalog.pg_backup_start_time.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public PgBackupStartTime() {
        super("pg_backup_start_time", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
    }
}