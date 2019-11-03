/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.PgCatalog;
import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records.PgSequencesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PgSequences extends TableImpl<PgSequencesRecord> {

    private static final long serialVersionUID = -1602131615;

    /**
     * The reference instance of <code>pg_catalog.pg_sequences</code>
     */
    public static final PgSequences PG_SEQUENCES = new PgSequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSequencesRecord> getRecordType() {
        return PgSequencesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public final TableField<PgSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public final TableField<PgSequencesRecord, String> SEQUENCENAME = createField(DSL.name("sequencename"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public final TableField<PgSequencesRecord, String> SEQUENCEOWNER = createField(DSL.name("sequenceowner"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgSequencesRecord, Object> DATA_TYPE = createField(DSL.name("data_type"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\""), this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> START_VALUE = createField(DSL.name("start_value"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> MIN_VALUE = createField(DSL.name("min_value"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> MAX_VALUE = createField(DSL.name("max_value"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public final TableField<PgSequencesRecord, Long> INCREMENT_BY = createField(DSL.name("increment_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public final TableField<PgSequencesRecord, Boolean> CYCLE = createField(DSL.name("cycle"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public final TableField<PgSequencesRecord, Long> CACHE_SIZE = createField(DSL.name("cache_size"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> LAST_VALUE = createField(DSL.name("last_value"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences() {
        this(DSL.name("pg_sequences"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences(String alias) {
        this(DSL.name(alias), PG_SEQUENCES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences(Name alias) {
        this(alias, PG_SEQUENCES);
    }

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgSequences(Table<O> child, ForeignKey<O, PgSequencesRecord> key) {
        super(child, key, PG_SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public PgSequences as(String alias) {
        return new PgSequences(DSL.name(alias), this);
    }

    @Override
    public PgSequences as(Name alias) {
        return new PgSequences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequences rename(String name) {
        return new PgSequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequences rename(Name name) {
        return new PgSequences(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
