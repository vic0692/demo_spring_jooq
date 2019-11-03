/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgDefaultAclRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class PgDefaultAcl extends TableImpl<PgDefaultAclRecord> {

    private static final long serialVersionUID = 3269562;

    /**
     * The reference instance of <code>pg_catalog.pg_default_acl</code>
     */
    public static final PgDefaultAcl PG_DEFAULT_ACL = new PgDefaultAcl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDefaultAclRecord> getRecordType() {
        return PgDefaultAclRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_default_acl.defaclrole</code>.
     */
    public final TableField<PgDefaultAclRecord, Long> DEFACLROLE = createField(DSL.name("defaclrole"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_default_acl.defaclnamespace</code>.
     */
    public final TableField<PgDefaultAclRecord, Long> DEFACLNAMESPACE = createField(DSL.name("defaclnamespace"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_default_acl.defaclobjtype</code>.
     */
    public final TableField<PgDefaultAclRecord, String> DEFACLOBJTYPE = createField(DSL.name("defaclobjtype"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_default_acl.defaclacl</code>.
     */
    public final TableField<PgDefaultAclRecord, String[]> DEFACLACL = createField(DSL.name("defaclacl"), org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_default_acl</code> table reference
     */
    public PgDefaultAcl() {
        this(DSL.name("pg_default_acl"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_default_acl</code> table reference
     */
    public PgDefaultAcl(String alias) {
        this(DSL.name(alias), PG_DEFAULT_ACL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_default_acl</code> table reference
     */
    public PgDefaultAcl(Name alias) {
        this(alias, PG_DEFAULT_ACL);
    }

    private PgDefaultAcl(Name alias, Table<PgDefaultAclRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDefaultAcl(Name alias, Table<PgDefaultAclRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgDefaultAcl(Table<O> child, ForeignKey<O, PgDefaultAclRecord> key) {
        super(child, key, PG_DEFAULT_ACL);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_DEFAULT_ACL_ROLE_NSP_OBJ_INDEX);
    }

    @Override
    public PgDefaultAcl as(String alias) {
        return new PgDefaultAcl(DSL.name(alias), this);
    }

    @Override
    public PgDefaultAcl as(Name alias) {
        return new PgDefaultAcl(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDefaultAcl rename(String name) {
        return new PgDefaultAcl(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDefaultAcl rename(Name name) {
        return new PgDefaultAcl(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}