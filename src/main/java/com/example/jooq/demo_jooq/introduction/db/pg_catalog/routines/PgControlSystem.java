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
public class PgControlSystem extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 826120400;

    /**
     * The parameter <code>pg_catalog.pg_control_system.pg_control_version</code>.
     */
    public static final Parameter<Integer> PG_CONTROL_VERSION = Internal.createParameter("pg_control_version", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_system.catalog_version_no</code>.
     */
    public static final Parameter<Integer> CATALOG_VERSION_NO = Internal.createParameter("catalog_version_no", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_system.system_identifier</code>.
     */
    public static final Parameter<Long> SYSTEM_IDENTIFIER = Internal.createParameter("system_identifier", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_system.pg_control_last_modified</code>.
     */
    public static final Parameter<OffsetDateTime> PG_CONTROL_LAST_MODIFIED = Internal.createParameter("pg_control_last_modified", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public PgControlSystem() {
        super("pg_control_system", PgCatalog.PG_CATALOG);

        addOutParameter(PG_CONTROL_VERSION);
        addOutParameter(CATALOG_VERSION_NO);
        addOutParameter(SYSTEM_IDENTIFIER);
        addOutParameter(PG_CONTROL_LAST_MODIFIED);
    }

    /**
     * Get the <code>pg_control_version</code> parameter OUT value from the routine
     */
    public Integer getPgControlVersion() {
        return get(PG_CONTROL_VERSION);
    }

    /**
     * Get the <code>catalog_version_no</code> parameter OUT value from the routine
     */
    public Integer getCatalogVersionNo() {
        return get(CATALOG_VERSION_NO);
    }

    /**
     * Get the <code>system_identifier</code> parameter OUT value from the routine
     */
    public Long getSystemIdentifier() {
        return get(SYSTEM_IDENTIFIER);
    }

    /**
     * Get the <code>pg_control_last_modified</code> parameter OUT value from the routine
     */
    public OffsetDateTime getPgControlLastModified() {
        return get(PG_CONTROL_LAST_MODIFIED);
    }
}
