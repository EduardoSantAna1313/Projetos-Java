/*
 * COPYRIGHT FH 2020 - ALL RIGHTS RESERVED.
 *
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of FH.
 */
package br.com.edu.excel.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

/**
 * @author FH - edusilva
 *
 */
public class ExcelUtil {

    /**
     * Create a new instance of ExcelUtil
     */
    private ExcelUtil() {
        super();
    }

    /**
     * Recupera o valor da celula como String.
     *
     * @param pCell
     * @return
     */
    public static String cellValueAsString(final Cell pCell) {
        if (pCell == null) {
            return "";
        }

        final CellType cellType = pCell.getCellType();
        if (cellType.equals(CellType.STRING)) {
            return pCell.getRichStringCellValue().getString();
        }
        else if (cellType.equals(CellType.NUMERIC)) {
            return String.valueOf(pCell.getNumericCellValue());
        }
        else if (cellType.equals(CellType.BOOLEAN)) {
            return String.valueOf(pCell.getBooleanCellValue());
        }
        else if (CellType.FORMULA.equals(cellType)) {
            return pCell.getCellFormula();
        }
        return pCell.toString();
    }

}
