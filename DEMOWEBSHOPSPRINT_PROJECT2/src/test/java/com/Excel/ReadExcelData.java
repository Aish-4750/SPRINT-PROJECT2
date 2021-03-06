package com.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			//Object[][] testdata = null;
			//Getting the Relative path for excel from Source Excel folder
			String filePath = System.getProperty("user.dir")+"\\Excel\\TestingData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			System.out.println(testData);
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
}	
	/*public static void main(String[] args) throws Exception {
	Read obj = new Read();
	obj.readExcel(0,0);
	}*/



