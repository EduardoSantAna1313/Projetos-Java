package br.com.edu.excel.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author edusilva
 *
 */
public class SheetBO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -526371128656642551L;

    private String name;

    private List<RowBO> rows;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<RowBO> getRows() {
        return rows;
    }

    public void setRows(final List<RowBO> rows) {
        this.rows = rows;
    }

}