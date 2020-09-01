package br.com.edu.excel.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author edusilva
 *
 */
public class Column implements Serializable {

    /**
     * BigDecimal - numericValue.
     */
    private BigDecimal numericValue;

    /**
     * String - stringValue.
     */
    private String stringValue;

    /**
     * Date - dateValue.
     */
    private Date dateValue;

    /**
     * Object - value.
     */
    private Object value;

    /**
     * Retrieve the value of numericValue.
     *
     * @return the numericValue
     */
    public BigDecimal getNumericValue() {
        return numericValue;
    }

    /**
     * Set a new value to numericValue.
     *
     * @param numericValue
     *                         the numericValue to set
     */
    public void setNumericValue(final BigDecimal numericValue) {
        this.numericValue = numericValue;
    }

    /**
     * Retrieve the value of stringValue.
     *
     * @return the stringValue
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Set a new value to stringValue.
     *
     * @param stringValue
     *                        the stringValue to set
     */
    public void setStringValue(final String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * Retrieve the value of dateValue.
     *
     * @return the dateValue
     */
    public Date getDateValue() {
        return dateValue;
    }

    /**
     * Set a new value to dateValue.
     *
     * @param dateValue
     *                      the dateValue to set
     */
    public void setDateValue(final Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * Retrieve the value of value.
     *
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * Set a new value to value.
     *
     * @param value
     *                  the value to set
     */
    public void setValue(final Object value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Column [numericValue=" + numericValue + ", stringValue=" + stringValue + ", dateValue=" + dateValue
                + ", value=" + value + "]";
    }

}