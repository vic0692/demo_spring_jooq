/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.records;


import com.example.jooq.demo_jooq.introduction.db.pg_catalog.tables.PgTimezoneAbbrevs;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
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
public class PgTimezoneAbbrevsRecord extends TableRecordImpl<PgTimezoneAbbrevsRecord> implements Record3<String, YearToSecond, Boolean> {

    private static final long serialVersionUID = 1530208218;

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>.
     */
    public void setAbbrev(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>.
     */
    public String getAbbrev() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>.
     */
    public void setUtcOffset(YearToSecond value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>.
     */
    public YearToSecond getUtcOffset() {
        return (YearToSecond) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>.
     */
    public void setIsDst(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>.
     */
    public Boolean getIsDst() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, YearToSecond, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, YearToSecond, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.ABBREV;
    }

    @Override
    public Field<YearToSecond> field2() {
        return PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.UTC_OFFSET;
    }

    @Override
    public Field<Boolean> field3() {
        return PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.IS_DST;
    }

    @Override
    public String component1() {
        return getAbbrev();
    }

    @Override
    public YearToSecond component2() {
        return getUtcOffset();
    }

    @Override
    public Boolean component3() {
        return getIsDst();
    }

    @Override
    public String value1() {
        return getAbbrev();
    }

    @Override
    public YearToSecond value2() {
        return getUtcOffset();
    }

    @Override
    public Boolean value3() {
        return getIsDst();
    }

    @Override
    public PgTimezoneAbbrevsRecord value1(String value) {
        setAbbrev(value);
        return this;
    }

    @Override
    public PgTimezoneAbbrevsRecord value2(YearToSecond value) {
        setUtcOffset(value);
        return this;
    }

    @Override
    public PgTimezoneAbbrevsRecord value3(Boolean value) {
        setIsDst(value);
        return this;
    }

    @Override
    public PgTimezoneAbbrevsRecord values(String value1, YearToSecond value2, Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTimezoneAbbrevsRecord
     */
    public PgTimezoneAbbrevsRecord() {
        super(PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS);
    }

    /**
     * Create a detached, initialised PgTimezoneAbbrevsRecord
     */
    public PgTimezoneAbbrevsRecord(String abbrev, YearToSecond utcOffset, Boolean isDst) {
        super(PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS);

        set(0, abbrev);
        set(1, utcOffset);
        set(2, isDst);
    }
}
