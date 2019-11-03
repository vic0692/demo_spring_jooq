/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatioUserSequencesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class PgStatioUserSequences extends TableImpl<PgStatioUserSequencesRecord> {

    private static final long serialVersionUID = 870975421;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_user_sequences</code>
     */
    public static final PgStatioUserSequences PG_STATIO_USER_SEQUENCES = new PgStatioUserSequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioUserSequencesRecord> getRecordType() {
        return PgStatioUserSequencesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.relid</code>.
     */
    public final TableField<PgStatioUserSequencesRecord, Long> RELID = createField(DSL.name("relid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.schemaname</code>.
     */
    public final TableField<PgStatioUserSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.relname</code>.
     */
    public final TableField<PgStatioUserSequencesRecord, String> RELNAME = createField(DSL.name("relname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.blks_read</code>.
     */
    public final TableField<PgStatioUserSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_sequences.blks_hit</code>.
     */
    public final TableField<PgStatioUserSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_user_sequences</code> table reference
     */
    public PgStatioUserSequences() {
        this(DSL.name("pg_statio_user_sequences"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_sequences</code> table reference
     */
    public PgStatioUserSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_USER_SEQUENCES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_sequences</code> table reference
     */
    public PgStatioUserSequences(Name alias) {
        this(alias, PG_STATIO_USER_SEQUENCES);
    }

    private PgStatioUserSequences(Name alias, Table<PgStatioUserSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioUserSequences(Name alias, Table<PgStatioUserSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatioUserSequences(Table<O> child, ForeignKey<O, PgStatioUserSequencesRecord> key) {
        super(child, key, PG_STATIO_USER_SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioUserSequences as(String alias) {
        return new PgStatioUserSequences(DSL.name(alias), this);
    }

    @Override
    public PgStatioUserSequences as(Name alias) {
        return new PgStatioUserSequences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserSequences rename(String name) {
        return new PgStatioUserSequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserSequences rename(Name name) {
        return new PgStatioUserSequences(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}