package br.com.edu.excel;

import java.io.File;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import br.com.edu.excel.util.ExcelUtil;
import br.com.edu.excel.util.StringUtil;
import br.com.edu.excel.util.StringUtil.Direction;

/**
 * Lê planilha excel.
 *
 * @author FH - edusilva
 *
 */
public class MainReader {

    public static void main(final String[] args) {

        final File f = new File("src/resource/sample.xlsx");

        try (final Workbook workbook = WorkbookFactory.create(f)) {

            final Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            while (sheetIterator.hasNext()) {
                final Sheet sheet = sheetIterator.next();

                System.out.println(sheet.getSheetName());
                final Iterator<Row> rowIterator = sheet.rowIterator();
                while (rowIterator.hasNext()) {
                    final Row row = rowIterator.next();
                    for (int i = 0; i < row.getLastCellNum(); i++) {
                        final Cell cell = row.getCell(i);
                        final String value = ExcelUtil.cellValueAsString(cell);
                        System.out.print(StringUtil.padding(value, 15, ' ', Direction.RIGTH));
                        System.out.print("|");
                    }
                    System.out.println();
                }
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
