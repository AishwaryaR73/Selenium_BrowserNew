package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("./testData/Smoketest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("smoketest");
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count are: " + rowCount); // 3
		System.out.println("Column Count are: " + columnCount); // 5

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow currentRow = sheet.getRow(i);
			String userName = currentRow.getCell(0).toString();
			String password = currentRow.getCell(1).toString();
			String email = currentRow.getCell(2).toString();
			String phone = currentRow.getCell(3).toString();
			System.out.println("UserName information: " + i + "    " + userName + "     " + password);

		}
	}

}
