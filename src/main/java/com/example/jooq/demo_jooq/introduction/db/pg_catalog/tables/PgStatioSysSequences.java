/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatioSysSequencesRecord;

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
public class PgStatioSysSequences extends TableImpl<PgStatioSysSequencesRecord> {

    private static final long serialVersionUID = 1408940519;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_sys_sequences</code>
     */
    public static final PgStatioSysSequences PG_STATIO_SYS_SEQUENCES = new PgStatioSysSequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioSysSequencesRecord> getRecordType() {
        return PgStatioSysSequencesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_sys_sequences.relid</code>.
     */
    public final TableField<PgStatioSysSequencesRecord, Long> RELID = createField(DSL.name("relid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_sequences.schemaname</code>.
     */
    public final TableField<PgStatioSysSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_sequences.relname</code>.
     */
    public final TableField<PgStatioSysSequencesRecord, String> RELNAME = createField(DSL.name("relname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_sequences.blks_read</code>.
     */
    public final TableField<PgStatioSysSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_sequences.blks_hit</code>.
     */
    public final TableField<PgStatioSysSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_sys_sequences</code> table reference
     */
    public PgStatioSysSequences() {
        this(DSL.name("pg_statio_sys_sequences"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_sequences</code> table reference
     */
    public PgStatioSysSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_SYS_SEQUENCES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_sequences</code> table reference
     */
    public PgStatioSysSequences(Name alias) {
        this(alias, PG_STATIO_SYS_SEQUENCES);
    }

    private PgStatioSysSequences(Name alias, Table<PgStatioSysSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysSequences(Name alias, Table<PgStatioSysSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatioSysSequences(Table<O> child, ForeignKey<O, PgStatioSysSequencesRecord> key) {
        super(child, key, PG_STATIO_SYS_SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioSysSequences as(String alias) {
        return new PgStatioSysSequences(DSL.name(alias), this);
    }

    @Override
    public PgStatioSysSequences as(Name alias) {
        return new PgStatioSysSequences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysSequences rename(String name) {
        return new PgStatioSysSequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysSequences rename(Name name) {
        return new PgStatioSysSequences(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
