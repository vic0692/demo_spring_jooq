/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgAttributeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row22;
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
public class PgAttribute extends TableImpl<PgAttributeRecord> {

    private static final long serialVersionUID = 67786372;

    /**
     * The reference instance of <code>pg_catalog.pg_attribute</code>
     */
    public static final PgAttribute PG_ATTRIBUTE = new PgAttribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAttributeRecord> getRecordType() {
        return PgAttributeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTRELID = createField(DSL.name("attrelid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attname</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTNAME = createField(DSL.name("attname"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTTYPID = createField(DSL.name("atttypid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTSTATTARGET = createField(DSL.name("attstattarget"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTLEN = createField(DSL.name("attlen"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTNUM = createField(DSL.name("attnum"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTNDIMS = createField(DSL.name("attndims"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTCACHEOFF = createField(DSL.name("attcacheoff"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTTYPMOD = createField(DSL.name("atttypmod"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTBYVAL = createField(DSL.name("attbyval"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTSTORAGE = createField(DSL.name("attstorage"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTALIGN = createField(DSL.name("attalign"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTNOTNULL = createField(DSL.name("attnotnull"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTHASDEF = createField(DSL.name("atthasdef"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTIDENTITY = createField(DSL.name("attidentity"), org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISDROPPED = createField(DSL.name("attisdropped"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISLOCAL = createField(DSL.name("attislocal"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTINHCOUNT = createField(DSL.name("attinhcount"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTCOLLATION = createField(DSL.name("attcollation"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTACL = createField(DSL.name("attacl"), org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTOPTIONS = createField(DSL.name("attoptions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTFDWOPTIONS = createField(DSL.name("attfdwoptions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute() {
        this(DSL.name("pg_attribute"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(String alias) {
        this(DSL.name(alias), PG_ATTRIBUTE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(Name alias) {
        this(alias, PG_ATTRIBUTE);
    }

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgAttribute(Table<O> child, ForeignKey<O, PgAttributeRecord> key) {
        super(child, key, PG_ATTRIBUTE);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_ATTRIBUTE_RELID_ATTNAM_INDEX, Indexes.PG_ATTRIBUTE_RELID_ATTNUM_INDEX);
    }

    @Override
    public PgAttribute as(String alias) {
        return new PgAttribute(DSL.name(alias), this);
    }

    @Override
    public PgAttribute as(Name alias) {
        return new PgAttribute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(String name) {
        return new PgAttribute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(Name name) {
        return new PgAttribute(name, null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, String, Long, Integer, Short, Short, Integer, Integer, Integer, Boolean, String, String, Boolean, Boolean, String, Boolean, Boolean, Integer, Long, String[], String[], String[]> fieldsRow() {
        return (Row22) super.fieldsRow();
    }
}
