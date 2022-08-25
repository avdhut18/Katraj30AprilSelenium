package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {

	
	public String excelReading(int sheetNo,int rowValue, int cellValue) throws IOException {
		File path = new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj30thApril2022\\Velocity.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		return sheet1.getRow(rowValue).getCell(cellValue).getStringCellValue();
	}
	
	public void excelWrite(int sheetNo,int rowValue, int cellValue, String data) throws IOException {
		File path = new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj30thApril2022\\Velocity.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		FileOutputStream input= new FileOutputStream(path);
		sheet1.getRow(rowValue).createCell(cellValue).setCellValue(data);
		workbook.write(input);
		input.close();
		workbook.close();
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		ExcelReadWriteUtility exRead= new ExcelReadWriteUtility();
		System.out.println(exRead.excelReading(0, 0, 0)); 
		System.out.println(exRead.excelReading(0, 0, 1));
		System.out.println(exRead.excelReading(0, 0, 2));
		exRead.excelWrite(0, 1, 0, "TestNg");
		exRead.excelWrite(0, 1, 1, "Maven");
		exRead.excelWrite(0, 1, 2, "Oops");
	}
}
