package com.org.lnt.action;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("./testData/Smoketest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("smoketest");
		int rowCount = sheet.getLastRowNum();
		int coulmnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The row count are:" + rowCount);
		System.out.println("The row count are:" + coulmnCount);
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			String un = currentRow.getCell(0).toString();
			String pwd = currentRow.getCell(1).toString();
			System.out.println("The data are:" + un + "    " + pwd);
		}
	}

}
