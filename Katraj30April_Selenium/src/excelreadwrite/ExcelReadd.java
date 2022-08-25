package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadd {

	public static void main(String[] args) throws IOException {
	
		//get path of excel file 
		File path= new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj30thApril2022\\Velocity.xlsx");
		
		//load excel file
		FileInputStream load = new FileInputStream(path);
		
		//workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook where we want to read 
		XSSFSheet sheet1 = workbook.getSheetAt(0);
	
		//get cell to read data from it
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
