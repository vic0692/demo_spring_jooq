/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgHbaFileRulesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class PgHbaFileRules extends TableImpl<PgHbaFileRulesRecord> {

    private static final long serialVersionUID = -1489034014;

    /**
     * The reference instance of <code>pg_catalog.pg_hba_file_rules</code>
     */
    public static final PgHbaFileRules PG_HBA_FILE_RULES = new PgHbaFileRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgHbaFileRulesRecord> getRecordType() {
        return PgHbaFileRulesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public final TableField<PgHbaFileRulesRecord, Integer> LINE_NUMBER = createField(DSL.name("line_number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> DATABASE = createField(DSL.name("database"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> USER_NAME = createField(DSL.name("user_name"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> NETMASK = createField(DSL.name("netmask"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> AUTH_METHOD = createField(DSL.name("auth_method"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> OPTIONS = createField(DSL.name("options"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ERROR = createField(DSL.name("error"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules() {
        this(DSL.name("pg_hba_file_rules"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules(String alias) {
        this(DSL.name(alias), PG_HBA_FILE_RULES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules(Name alias) {
        this(alias, PG_HBA_FILE_RULES);
    }

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgHbaFileRules(Table<O> child, ForeignKey<O, PgHbaFileRulesRecord> key) {
        super(child, key, PG_HBA_FILE_RULES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgHbaFileRules as(String alias) {
        return new PgHbaFileRules(DSL.name(alias), this, parameters);
    }

    @Override
    public PgHbaFileRules as(Name alias) {
        return new PgHbaFileRules(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(String name) {
        return new PgHbaFileRules(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(Name name) {
        return new PgHbaFileRules(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String[], String[], String, String, String, String[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgHbaFileRules call() {
        return new PgHbaFileRules(DSL.name(getName()), null, new Field[] { 
        });
    }
}