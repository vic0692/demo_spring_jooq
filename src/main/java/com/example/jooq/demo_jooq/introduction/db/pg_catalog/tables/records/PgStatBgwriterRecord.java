/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgStatBgwriter;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


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
public class PgStatBgwriterRecord extends TableRecordImpl<PgStatBgwriterRecord> implements Record11<Long, Long, Double, Double, Long, Long, Long, Long, Long, Long, OffsetDateTime> {

    private static final long serialVersionUID = 2051007384;

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>.
     */
    public void setCheckpointsTimed(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>.
     */
    public Long getCheckpointsTimed() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>.
     */
    public void setCheckpointsReq(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>.
     */
    public Long getCheckpointsReq() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.checkpoint_write_time</code>.
     */
    public void setCheckpointWriteTime(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.checkpoint_write_time</code>.
     */
    public Double getCheckpointWriteTime() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.checkpoint_sync_time</code>.
     */
    public void setCheckpointSyncTime(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.checkpoint_sync_time</code>.
     */
    public Double getCheckpointSyncTime() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>.
     */
    public void setBuffersCheckpoint(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>.
     */
    public Long getBuffersCheckpoint() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>.
     */
    public void setBuffersClean(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>.
     */
    public Long getBuffersClean() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>.
     */
    public void setMaxwrittenClean(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>.
     */
    public Long getMaxwrittenClean() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>.
     */
    public void setBuffersBackend(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>.
     */
    public Long getBuffersBackend() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.buffers_backend_fsync</code>.
     */
    public void setBuffersBackendFsync(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.buffers_backend_fsync</code>.
     */
    public Long getBuffersBackendFsync() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>.
     */
    public void setBuffersAlloc(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>.
     */
    public Long getBuffersAlloc() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_bgwriter.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_bgwriter.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Double, Double, Long, Long, Long, Long, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, Double, Double, Long, Long, Long, Long, Long, Long, OffsetDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_TIMED;
    }

    @Override
    public Field<Long> field2() {
        return PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_REQ;
    }

    @Override
    public Field<Double> field3() {
        return PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINT_WRITE_TIME;
    }

    @Override
    public Field<Double> field4() {
        return PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINT_SYNC_TIME;
    }

    @Override
    public Field<Long> field5() {
        return PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CHECKPOINT;
    }

    @Override
    public Field<Long> field6() {
        return PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CLEAN;
    }

    @Override
    public Field<Long> field7() {
        return PgStatBgwriter.PG_STAT_BGWRITER.MAXWRITTEN_CLEAN;
    }

    @Override
    public Field<Long> field8() {
        return PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_BACKEND;
    }

    @Override
    public Field<Long> field9() {
        return PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_BACKEND_FSYNC;
    }

    @Override
    public Field<Long> field10() {
        return PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_ALLOC;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return PgStatBgwriter.PG_STAT_BGWRITER.STATS_RESET;
    }

    @Override
    public Long component1() {
        return getCheckpointsTimed();
    }

    @Override
    public Long component2() {
        return getCheckpointsReq();
    }

    @Override
    public Double component3() {
        return getCheckpointWriteTime();
    }

    @Override
    public Double component4() {
        return getCheckpointSyncTime();
    }

    @Override
    public Long component5() {
        return getBuffersCheckpoint();
    }

    @Override
    public Long component6() {
        return getBuffersClean();
    }

    @Override
    public Long component7() {
        return getMaxwrittenClean();
    }

    @Override
    public Long component8() {
        return getBuffersBackend();
    }

    @Override
    public Long component9() {
        return getBuffersBackendFsync();
    }

    @Override
    public Long component10() {
        return getBuffersAlloc();
    }

    @Override
    public OffsetDateTime component11() {
        return getStatsReset();
    }

    @Override
    public Long value1() {
        return getCheckpointsTimed();
    }

    @Override
    public Long value2() {
        return getCheckpointsReq();
    }

    @Override
    public Double value3() {
        return getCheckpointWriteTime();
    }

    @Override
    public Double value4() {
        return getCheckpointSyncTime();
    }

    @Override
    public Long value5() {
        return getBuffersCheckpoint();
    }

    @Override
    public Long value6() {
        return getBuffersClean();
    }

    @Override
    public Long value7() {
        return getMaxwrittenClean();
    }

    @Override
    public Long value8() {
        return getBuffersBackend();
    }

    @Override
    public Long value9() {
        return getBuffersBackendFsync();
    }

    @Override
    public Long value10() {
        return getBuffersAlloc();
    }

    @Override
    public OffsetDateTime value11() {
        return getStatsReset();
    }

    @Override
    public PgStatBgwriterRecord value1(Long value) {
        setCheckpointsTimed(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value2(Long value) {
        setCheckpointsReq(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value3(Double value) {
        setCheckpointWriteTime(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value4(Double value) {
        setCheckpointSyncTime(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value5(Long value) {
        setBuffersCheckpoint(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value6(Long value) {
        setBuffersClean(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value7(Long value) {
        setMaxwrittenClean(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value8(Long value) {
        setBuffersBackend(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value9(Long value) {
        setBuffersBackendFsync(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value10(Long value) {
        setBuffersAlloc(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord value11(OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    public PgStatBgwriterRecord values(Long value1, Long value2, Double value3, Double value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, OffsetDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatBgwriterRecord
     */
    public PgStatBgwriterRecord() {
        super(PgStatBgwriter.PG_STAT_BGWRITER);
    }

    /**
     * Create a detached, initialised PgStatBgwriterRecord
     */
    public PgStatBgwriterRecord(Long checkpointsTimed, Long checkpointsReq, Double checkpointWriteTime, Double checkpointSyncTime, Long buffersCheckpoint, Long buffersClean, Long maxwrittenClean, Long buffersBackend, Long buffersBackendFsync, Long buffersAlloc, OffsetDateTime statsReset) {
        super(PgStatBgwriter.PG_STAT_BGWRITER);

        set(0, checkpointsTimed);
        set(1, checkpointsReq);
        set(2, checkpointWriteTime);
        set(3, checkpointSyncTime);
        set(4, buffersCheckpoint);
        set(5, buffersClean);
        set(6, maxwrittenClean);
        set(7, buffersBackend);
        set(8, buffersBackendFsync);
        set(9, buffersAlloc);
        set(10, statsReset);
    }
}