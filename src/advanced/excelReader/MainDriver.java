package advanced.excelReader;

public class MainDriver {

    static  String path = (System.getProperty("user.dir") + "/src/advanced/fileIO/unbilled.xlsx");
    static ExcelReader excelReader;


    public static void main(String[] args) {

        excelReader.fileReaderStringXSSF(path, "macys");
    }
}
