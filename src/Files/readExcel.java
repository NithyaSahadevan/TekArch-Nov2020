package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class readExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir") + "/src/Files/testdata.xls");
		String fpath = System.getProperty("user.dir") + "/src/Files/testdata.xls";
		String[][] retData = readExcelData(fpath, "Sheet1");

		for (int i = 0; i < retData.length; i++) {
			for (int j = 0; j < retData[0].length; j++) {
				System.out.print(retData[i][j] + " ");
			}
			System.out.println();
		}
		//readExcelFile_xlsx();
	}

	/*public static void readExcelFile_xlsx() throws Exception {
		// xmlbeans
		String sFilePath = System.getProperty("user.dir") + "/src/Files/data2.xlsx";
		XSSFWorkbook myExWorBook = new XSSFWorkbook(new FileInputStream(sFilePath));
		XSSFSheet myExcelSheet = myExWorBook.getSheet("Sheet1");
		XSSFRow row1 = myExcelSheet.getRow(0);

		System.out.println(row1.getCell(0).getStringCellValue());
		System.out.println(row1.getCell(1).getNumericCellValue());
		System.out.println(row1.getCell(2).getStringCellValue());

	}*/

	public static String[][] readExcelData(String fPath, String sheetName) throws IOException {
		// Step 1 : Get the excel path
		File xFile = new File(fPath);

		// Step 2 :Access the excel file
		FileInputStream xlDoc = new FileInputStream(xFile);

		// Step 3 :Access the excel workbook
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);

		// Step 3 :Access the excel sheet
		HSSFSheet sheet = wb.getSheet(sheetName);

		DataFormatter formatter = new DataFormatter();

		int iRowCount = sheet.getLastRowNum() + 1;
		int iColCount = sheet.getRow(0).getLastCellNum();

		String[][] xlData = new String[iRowCount][iColCount];

		for (int i = 0; i < iRowCount; i++) {
			for (int j = 0; j < iColCount; j++) {
				xlData[i][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return xlData;
	}

}
