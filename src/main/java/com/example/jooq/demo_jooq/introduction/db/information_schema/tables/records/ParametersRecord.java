/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.information_schema.tables.records;


import com.example.jooq.demo_jooq.introduction.db.information_schema.tables.Parameters;

import javax.annotation.Generated;

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
public class ParametersRecord extends TableRecordImpl<ParametersRecord> {

    private static final long serialVersionUID = -1219676498;

    /**
     * Setter for <code>information_schema.parameters.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.parameters.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.parameters.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.parameters.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.parameters.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.parameters.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.parameters.ordinal_position</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.parameters.ordinal_position</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.parameters.parameter_mode</code>.
     */
    public void setParameterMode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.parameters.parameter_mode</code>.
     */
    public String getParameterMode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.parameters.is_result</code>.
     */
    public void setIsResult(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.parameters.is_result</code>.
     */
    public String getIsResult() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.parameters.as_locator</code>.
     */
    public void setAsLocator(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.parameters.as_locator</code>.
     */
    public String getAsLocator() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.parameters.parameter_name</code>.
     */
    public void setParameterName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.parameters.parameter_name</code>.
     */
    public String getParameterName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.parameters.data_type</code>.
     */
    public void setDataType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.parameters.data_type</code>.
     */
    public String getDataType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.parameters.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.parameters.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.parameters.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.parameters.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>information_schema.parameters.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.parameters.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.parameters.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.parameters.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.parameters.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.parameters.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.parameters.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.parameters.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.parameters.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.parameters.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.parameters.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.parameters.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.parameters.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.parameters.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.parameters.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.parameters.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>information_schema.parameters.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.parameters.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>information_schema.parameters.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.parameters.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>information_schema.parameters.interval_type</code>.
     */
    public void setIntervalType(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.parameters.interval_type</code>.
     */
    public String getIntervalType() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.parameters.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.parameters.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>information_schema.parameters.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.parameters.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.parameters.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.parameters.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.parameters.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.parameters.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.parameters.scope_catalog</code>.
     */
    public void setScopeCatalog(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.parameters.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.parameters.scope_schema</code>.
     */
    public void setScopeSchema(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.parameters.scope_schema</code>.
     */
    public String getScopeSchema() {
        return (String) get(27);
    }

    /**
     * Setter for <code>information_schema.parameters.scope_name</code>.
     */
    public void setScopeName(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.parameters.scope_name</code>.
     */
    public String getScopeName() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.parameters.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.parameters.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>information_schema.parameters.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.parameters.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(30);
    }

    /**
     * Setter for <code>information_schema.parameters.parameter_default</code>.
     */
    public void setParameterDefault(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.parameters.parameter_default</code>.
     */
    public String getParameterDefault() {
        return (String) get(31);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParametersRecord
     */
    public ParametersRecord() {
        super(Parameters.PARAMETERS);
    }

    /**
     * Create a detached, initialised ParametersRecord
     */
    public ParametersRecord(String specificCatalog, String specificSchema, String specificName, Integer ordinalPosition, String parameterMode, String isResult, String asLocator, String parameterName, String dataType, Integer characterMaximumLength, Integer characterOctetLength, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String udtCatalog, String udtSchema, String udtName, String scopeCatalog, String scopeSchema, String scopeName, Integer maximumCardinality, String dtdIdentifier, String parameterDefault) {
        super(Parameters.PARAMETERS);

        set(0, specificCatalog);
        set(1, specificSchema);
        set(2, specificName);
        set(3, ordinalPosition);
        set(4, parameterMode);
        set(5, isResult);
        set(6, asLocator);
        set(7, parameterName);
        set(8, dataType);
        set(9, characterMaximumLength);
        set(10, characterOctetLength);
        set(11, characterSetCatalog);
        set(12, characterSetSchema);
        set(13, characterSetName);
        set(14, collationCatalog);
        set(15, collationSchema);
        set(16, collationName);
        set(17, numericPrecision);
        set(18, numericPrecisionRadix);
        set(19, numericScale);
        set(20, datetimePrecision);
        set(21, intervalType);
        set(22, intervalPrecision);
        set(23, udtCatalog);
        set(24, udtSchema);
        set(25, udtName);
        set(26, scopeCatalog);
        set(27, scopeSchema);
        set(28, scopeName);
        set(29, maximumCardinality);
        set(30, dtdIdentifier);
        set(31, parameterDefault);
    }
}
