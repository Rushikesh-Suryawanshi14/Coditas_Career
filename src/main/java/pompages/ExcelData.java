package pompages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ExcelData {
    String projectPath;
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public ExcelData() {
        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectPath + "/dataFiles/CandidateData.xlsx");
            sheet = workbook.getSheet("Sheet1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExcelData excel = new ExcelData();
    }

    public void getRowCount() {
        try {
            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows" + rowCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellDataString(int rowNum, int colNum) {
        String cellData="";
        try {
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellData;
    }

    public double getCellDataNumber(int rowNum, int colNum) {
        double cellData=0;
        try {
             cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellData;
    }

}