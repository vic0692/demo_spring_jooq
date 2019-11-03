/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.Indexes;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgSequenceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class PgSequence extends TableImpl<PgSequenceRecord> {

    private static final long serialVersionUID = -479906455;

    /**
     * The reference instance of <code>pg_catalog.pg_sequence</code>
     */
    public static final PgSequence PG_SEQUENCE = new PgSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSequenceRecord> getRecordType() {
        return PgSequenceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQRELID = createField(DSL.name("seqrelid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQTYPID = createField(DSL.name("seqtypid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQSTART = createField(DSL.name("seqstart"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQINCREMENT = createField(DSL.name("seqincrement"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQMAX = createField(DSL.name("seqmax"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQMIN = createField(DSL.name("seqmin"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQCACHE = createField(DSL.name("seqcache"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public final TableField<PgSequenceRecord, Boolean> SEQCYCLE = createField(DSL.name("seqcycle"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence() {
        this(DSL.name("pg_sequence"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(String alias) {
        this(DSL.name(alias), PG_SEQUENCE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(Name alias) {
        this(alias, PG_SEQUENCE);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgSequence(Table<O> child, ForeignKey<O, PgSequenceRecord> key) {
        super(child, key, PG_SEQUENCE);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_SEQUENCE_SEQRELID_INDEX);
    }

    @Override
    public PgSequence as(String alias) {
        return new PgSequence(DSL.name(alias), this);
    }

    @Override
    public PgSequence as(Name alias) {
        return new PgSequence(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(String name) {
        return new PgSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Name name) {
        return new PgSequence(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, Long, Long, Long, Long, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
