/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables;


import com.example.jooq.demo_jooq.introduction.db.information_schema.InformationSchema;
import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records.ParametersRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Parameters extends TableImpl<ParametersRecord> {

    private static final long serialVersionUID = -201652895;

    /**
     * The reference instance of <code>information_schema.parameters</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParametersRecord> getRecordType() {
        return ParametersRecord.class;
    }

    /**
     * The column <code>information_schema.parameters.specific_catalog</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.specific_schema</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.specific_name</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.ordinal_position</code>.
     */
    public final TableField<ParametersRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.parameter_mode</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_MODE = createField(DSL.name("parameter_mode"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.is_result</code>.
     */
    public final TableField<ParametersRecord, String> IS_RESULT = createField(DSL.name("is_result"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.parameters.as_locator</code>.
     */
    public final TableField<ParametersRecord, String> AS_LOCATOR = createField(DSL.name("as_locator"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.parameters.parameter_name</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_NAME = createField(DSL.name("parameter_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.data_type</code>.
     */
    public final TableField<ParametersRecord, String> DATA_TYPE = createField(DSL.name("data_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.character_maximum_length</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.character_octet_length</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.character_set_catalog</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.character_set_schema</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.character_set_name</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.collation_catalog</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.collation_schema</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.collation_name</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.numeric_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.numeric_precision_radix</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.numeric_scale</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.datetime_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.interval_type</code>.
     */
    public final TableField<ParametersRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.interval_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.udt_catalog</code>.
     */
    public final TableField<ParametersRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.udt_schema</code>.
     */
    public final TableField<ParametersRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.udt_name</code>.
     */
    public final TableField<ParametersRecord, String> UDT_NAME = createField(DSL.name("udt_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.scope_catalog</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.scope_schema</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.scope_name</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.maximum_cardinality</code>.
     */
    public final TableField<ParametersRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.parameters.dtd_identifier</code>.
     */
    public final TableField<ParametersRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.parameters.parameter_default</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_DEFAULT = createField(DSL.name("parameter_default"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.parameters</code> table reference
     */
    public Parameters() {
        this(DSL.name("parameters"), null);
    }

    /**
     * Create an aliased <code>information_schema.parameters</code> table reference
     */
    public Parameters(String alias) {
        this(DSL.name(alias), PARAMETERS);
    }

    /**
     * Create an aliased <code>information_schema.parameters</code> table reference
     */
    public Parameters(Name alias) {
        this(alias, PARAMETERS);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, ParametersRecord> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Parameters as(String alias) {
        return new Parameters(DSL.name(alias), this);
    }

    @Override
    public Parameters as(Name alias) {
        return new Parameters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(String name) {
        return new Parameters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Name name) {
        return new Parameters(name, null);
    }
}
