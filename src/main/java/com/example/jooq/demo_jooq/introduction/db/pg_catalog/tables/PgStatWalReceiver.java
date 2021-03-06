/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgStatWalReceiverRecord;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class PgStatWalReceiver extends TableImpl<PgStatWalReceiverRecord> {

    private static final long serialVersionUID = -2121676176;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_wal_receiver</code>
     */
    public static final PgStatWalReceiver PG_STAT_WAL_RECEIVER = new PgStatWalReceiver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatWalReceiverRecord> getRecordType() {
        return PgStatWalReceiverRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> PID = createField(DSL.name("pid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> RECEIVE_START_LSN = createField(DSL.name("receive_start_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVE_START_TLI = createField(DSL.name("receive_start_tli"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> RECEIVED_LSN = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVED_TLI = createField(DSL.name("received_tli"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> SLOT_NAME = createField(DSL.name("slot_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> CONNINFO = createField(DSL.name("conninfo"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver() {
        this(DSL.name("pg_stat_wal_receiver"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver(String alias) {
        this(DSL.name(alias), PG_STAT_WAL_RECEIVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver(Name alias) {
        this(alias, PG_STAT_WAL_RECEIVER);
    }

    private PgStatWalReceiver(Name alias, Table<PgStatWalReceiverRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatWalReceiver(Name alias, Table<PgStatWalReceiverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatWalReceiver(Table<O> child, ForeignKey<O, PgStatWalReceiverRecord> key) {
        super(child, key, PG_STAT_WAL_RECEIVER);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatWalReceiver as(String alias) {
        return new PgStatWalReceiver(DSL.name(alias), this);
    }

    @Override
    public PgStatWalReceiver as(Name alias) {
        return new PgStatWalReceiver(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWalReceiver rename(String name) {
        return new PgStatWalReceiver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWalReceiver rename(Name name) {
        return new PgStatWalReceiver(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, Object, Integer, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
