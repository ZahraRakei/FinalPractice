package advanced.excelReader;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static String location = System.getProperty("user.dir");
    static String local = "/src/advanced/fileIO/unbilled.xlsx";
    static final String path = location + local;

    XSSFWorkbook xssfWorkbook = null;
    XSSFSheet xssfSheet = null;
    XSSFRow xssfRows = null;
    XSSFCell xssfCell = null;

    public String getCellValueXSSF(XSSFCell cell){
    Object value = null;

        CellType dataType = cell.getCellType();
        switch (dataType){
            case NUMERIC:
                value = cell.getNumericCellValue();
            case STRING:
                value = cell.getStringCellValue();
            case BOOLEAN:
                value = cell.getBooleanCellValue();
        }
        return value.toString();
}

    public String[][] fileReaderStringArrayXssf(String path, String sheet) throws IOException {
        String[][] excelData = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheet);
        int numberOfRows = xssfSheet.getLastRowNum();
        int numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        excelData = new String[numberOfRows + 1][numberOfCol + 1];

        for (int i = 0; i < excelData.length; i++) {
            XSSFRow rows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {

                xssfCell = rows.getCell(j);
                String cellData = getCellValueXSSF(xssfCell);
                excelData[i][j] = cellData;
            }
        }


    }
