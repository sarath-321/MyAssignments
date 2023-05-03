package week6.day2.servicenowdynamicdpxl;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./serviceNowXLData/" + fileName + ".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				String value = row.getCell(j).getStringCellValue();
				data[i - 1][j] = value;
				System.out.println(value);
			}
		}
		book.close();
		return data;

	}

}
