/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatReplicationRecord;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.YearToSecond;


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
public class PgStatReplication extends TableImpl<PgStatReplicationRecord> {

    private static final long serialVersionUID = 8207279;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_replication</code>
     */
    public static final PgStatReplication PG_STAT_REPLICATION = new PgStatReplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatReplicationRecord> getRecordType() {
        return PgStatReplicationRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> PID = createField(DSL.name("pid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> USESYSID = createField(DSL.name("usesysid"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public final TableField<PgStatReplicationRecord, String> USENAME = createField(DSL.name("usename"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public final TableField<PgStatReplicationRecord, String> APPLICATION_NAME = createField(DSL.name("application_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> CLIENT_ADDR = createField(DSL.name("client_addr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public final TableField<PgStatReplicationRecord, String> CLIENT_HOSTNAME = createField(DSL.name("client_hostname"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> CLIENT_PORT = createField(DSL.name("client_port"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public final TableField<PgStatReplicationRecord, OffsetDateTime> BACKEND_START = createField(DSL.name("backend_start"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> BACKEND_XMIN = createField(DSL.name("backend_xmin"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> SENT_LSN = createField(DSL.name("sent_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> WRITE_LSN = createField(DSL.name("write_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LSN = createField(DSL.name("flush_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LSN = createField(DSL.name("replay_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, YearToSecond> WRITE_LAG = createField(DSL.name("write_lag"), org.jooq.impl.SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, YearToSecond> FLUSH_LAG = createField(DSL.name("flush_lag"), org.jooq.impl.SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, YearToSecond> REPLAY_LAG = createField(DSL.name("replay_lag"), org.jooq.impl.SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> SYNC_PRIORITY = createField(DSL.name("sync_priority"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> SYNC_STATE = createField(DSL.name("sync_state"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication() {
        this(DSL.name("pg_stat_replication"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication(String alias) {
        this(DSL.name(alias), PG_STAT_REPLICATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication(Name alias) {
        this(alias, PG_STAT_REPLICATION);
    }

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatReplication(Table<O> child, ForeignKey<O, PgStatReplicationRecord> key) {
        super(child, key, PG_STAT_REPLICATION);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatReplication as(String alias) {
        return new PgStatReplication(DSL.name(alias), this);
    }

    @Override
    public PgStatReplication as(Name alias) {
        return new PgStatReplication(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(String name) {
        return new PgStatReplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(Name name) {
        return new PgStatReplication(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, Long, String, String, Object, String, Integer, OffsetDateTime, Long, String, Object, Object, Object, Object, YearToSecond, YearToSecond, YearToSecond, Integer, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
