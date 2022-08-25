package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteeee {

	public static void main(String[] args) throws IOException {
		//path excel
		File path = new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj30thApril2022\\Velocity.xlsx");
		//load file
		FileInputStream load= new FileInputStream(path);
		//workbook access 
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream input = new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("TestNg");
		workbook.write(input);
	}
}
