package advanced.fileIO;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Excel {

    XSSFWorkbook xssfWorkbook;
    XSSFSheet xssfSheet;
    XSSFRow xssfRow = null;
    XSSFCell xssfCell = null;

    String path = System.getProperty("user.dir")+ "/src/advanced/fileIO/unbilled.xlsx";

    FileOutputStream fos = null;
    int numberOfRows, numberOfCols, rowNum;

    public String[][] fileReaderArrayStringArrayXSSF(String path, String sheetName) throws IOException {
        String[][] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCols = xssfRow.getLastCellNum();
        data = new String[numberOfRows + 1]


        return data;
    }
}
