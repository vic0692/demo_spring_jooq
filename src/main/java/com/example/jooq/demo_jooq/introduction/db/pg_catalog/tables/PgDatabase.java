/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgDatabaseRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class PgDatabase extends TableImpl<PgDatabaseRecord> {

    private static final long serialVersionUID = 1031860540;

    /**
     * The reference instance of <code>pg_catalog.pg_database</code>
     */
    public static final PgDatabase PG_DATABASE = new PgDatabase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDatabaseRecord> getRecordType() {
        return PgDatabaseRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_database.datname</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATNAME = createField(DSL.name("datname"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datdba</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATDBA = createField(DSL.name("datdba"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.encoding</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> ENCODING = createField(DSL.name("encoding"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datcollate</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCOLLATE = createField(DSL.name("datcollate"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datctype</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCTYPE = createField(DSL.name("datctype"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATISTEMPLATE = createField(DSL.name("datistemplate"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATALLOWCONN = createField(DSL.name("datallowconn"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> DATCONNLIMIT = createField(DSL.name("datconnlimit"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATLASTSYSOID = createField(DSL.name("datlastsysoid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATFROZENXID = createField(DSL.name("datfrozenxid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATMINMXID = createField(DSL.name("datminmxid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATTABLESPACE = createField(DSL.name("dattablespace"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datacl</code>.
     */
    public final TableField<PgDatabaseRecord, String[]> DATACL = createField(DSL.name("datacl"), org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase() {
        this(DSL.name("pg_database"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(String alias) {
        this(DSL.name(alias), PG_DATABASE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(Name alias) {
        this(alias, PG_DATABASE);
    }

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgDatabase(Table<O> child, ForeignKey<O, PgDatabaseRecord> key) {
        super(child, key, PG_DATABASE);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_DATABASE_DATNAME_INDEX);
    }

    @Override
    public PgDatabase as(String alias) {
        return new PgDatabase(DSL.name(alias), this);
    }

    @Override
    public PgDatabase as(Name alias) {
        return new PgDatabase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(String name) {
        return new PgDatabase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(Name name) {
        return new PgDatabase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
