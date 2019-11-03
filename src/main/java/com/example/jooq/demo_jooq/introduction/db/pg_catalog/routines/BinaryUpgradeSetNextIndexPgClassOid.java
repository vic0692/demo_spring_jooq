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
public class BinaryUpgradeSetNextIndexPgClassOid extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1690151439;

    /**
     * The parameter <code>pg_catalog.binary_upgrade_set_next_index_pg_class_oid._1</code>.
     */
    public static final Parameter<Long> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public BinaryUpgradeSetNextIndexPgClassOid() {
        super("binary_upgrade_set_next_index_pg_class_oid", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }
}
