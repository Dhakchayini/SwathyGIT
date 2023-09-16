package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Student {
	 public static String value = "";
	
	public static String main(String[] args) throws IOException {
	
		File file1 = new File("C:\\Users\\purus\\eclipse-workspace\\Maven June\\excelsheets\\Student.xlsx");
		
		FileInputStream fileread = new FileInputStream(file1);
		
		Workbook book = new XSSFWorkbook(fileread);
		
		Sheet sheet = book.getSheet("student");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(2);
		
		int cellType = cell.getCellType();
		
		if(cellType==1) {
			
			value = cell.getStringCellValue();
		
		}else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date dateCellValue = cell.getDateCellValue();
			
			SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
			
			 value = dateformat.format(dateCellValue);
		
		}else {
			
			double numericCellValue = cell.getNumericCellValue();
			
			long l =(long)numericCellValue;
			
			 value = String.valueOf(numericCellValue);
			 
		}
		
		return value;
			 
			 
			 
		}
			
			
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

	
	

