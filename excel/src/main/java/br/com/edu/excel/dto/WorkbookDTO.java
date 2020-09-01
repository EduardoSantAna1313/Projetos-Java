package br.com.edu.excel.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edusilva
 *
 */
public class WorkbookDTO implements Serializable {

    /**
     * long - serialVersionUID.
     */
    private static final long serialVersionUID = -3328406117352554520L;

    /**
     * List<SheetBO> - sheet.
     */
    private List<SheetBO> sheet;

    /**
     * Retrieve the value of sheet.
     *
     * @return the sheet
     */
    public List<SheetBO> getSheet() {
        if (sheet == null) {
            sheet = new ArrayList<>();
        }
        return sheet;
    }

    /**
     * Set a new value to sheet.
     *
     * @param sheet
     *                  the sheet to set
     */
    public void setSheet(final List<SheetBO> sheet) {
        this.sheet = sheet;
    }

}