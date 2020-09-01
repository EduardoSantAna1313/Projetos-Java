package br.com.edu.excel.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edusilva
 *
 */
public class RowBO implements Serializable {

    /**
     * long - serialVersionUID.
     */
    private static final long serialVersionUID = 412733130451446693L;

    /**
     * List<Column> - columns.
     */
    private List<Column> columns;

    /**
     * Retrieve the value of columns.
     *
     * @return the columns
     */
    public List<Column> getColumns() {
        if (columns == null) {
            columns = new ArrayList<>();
        }
        return columns;
    }

    /**
     * Set a new value to columns.
     *
     * @param columns
     *                    the columns to set
     */
    public void setColumns(final List<Column> columns) {
        this.columns = columns;
    }

}