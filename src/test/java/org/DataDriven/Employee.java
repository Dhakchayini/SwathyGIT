package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public static void main(String[] args) throws IOException {

		// File Location
		File file = new File("C:\\Users\\purus\\eclipse-workspace\\Maven June\\excelsheets\\EmployeeDetails.xlsx");
		// To read a file
		FileInputStream fileread = new FileInputStream(file);
		// WorkBook Instantiation
		Workbook book = new XSSFWorkbook(fileread);
		// to get a particular sheet
		Sheet sheet = book.getSheet("salary");
		// to get a particular row
		//Row row = sheet.getRow(2);
		// to get a particular cell
		//Cell cell = row.getCell(7);
		System.out.println("Employee Sheet Data");
		System.out.println("--------------------"+"\n");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
//		System.out.println("\n"+"Students Sheet Data");
//		System.out.println("-------------------------"+"\n");
//	
//		Sheet student = book.getSheet("students");
//		
//		for (int i = 0; i < student.getPhysicalNumberOfRows(); i++) {
//			
//			Row sturow = student.getRow(i);
//			
//			for (int j = 0; j < sturow.getPhysicalNumberOfCells(); j++) {
//				
//				Cell stucell = sturow.getCell(j);
//				
//				System.out.println(stucell);
//			}
//			
//		}
//		
		
	}

}
