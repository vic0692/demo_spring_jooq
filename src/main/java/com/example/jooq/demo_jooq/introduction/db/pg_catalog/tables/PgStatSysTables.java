/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatSysTablesRecord;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PgStatSysTables extends TableImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 445092474;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_sys_tables</code>
     */
    public static final PgStatSysTables PG_STAT_SYS_TABLES = new PgStatSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSysTablesRecord> getRecordType() {
        return PgStatSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> RELID = createField(DSL.name("relid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> RELNAME = createField(DSL.name("relname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_LIVE_TUP = createField(DSL.name("n_live_tup"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_DEAD_TUP = createField(DSL.name("n_dead_tup"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField(DSL.name("n_mod_since_analyze"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_VACUUM = createField(DSL.name("last_vacuum"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOVACUUM = createField(DSL.name("last_autovacuum"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_ANALYZE = createField(DSL.name("last_analyze"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOANALYZE = createField(DSL.name("last_autoanalyze"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> VACUUM_COUNT = createField(DSL.name("vacuum_count"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOVACUUM_COUNT = createField(DSL.name("autovacuum_count"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> ANALYZE_COUNT = createField(DSL.name("analyze_count"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOANALYZE_COUNT = createField(DSL.name("autoanalyze_count"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables() {
        this(DSL.name("pg_stat_sys_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables(Name alias) {
        this(alias, PG_STAT_SYS_TABLES);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatSysTables(Table<O> child, ForeignKey<O, PgStatSysTablesRecord> key) {
        super(child, key, PG_STAT_SYS_TABLES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatSysTables as(String alias) {
        return new PgStatSysTables(DSL.name(alias), this);
    }

    @Override
    public PgStatSysTables as(Name alias) {
        return new PgStatSysTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(String name) {
        return new PgStatSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(Name name) {
        return new PgStatSysTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, Long, Long, Long, Long> fieldsRow() {
        return (Row22) super.fieldsRow();
    }
}
