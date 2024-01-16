package Selenium.Webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class _25_Apache_POI {

	public static void main(String[] args) throws IOException {
		
		 /* Java Part */
		 String excelfilepath = System.getProperty("user.dir")+ "\\Files\\employees.xlsx";
		 
		 File excelfile = new File(excelfilepath);
		 
		 FileInputStream file = new FileInputStream(excelfile);
		 
		 /*Apache POI part */
		 
		 /*POI versions should be same for poi,poi-ooxml,poi-ooxml-schemas in pom.xml*/
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		 XSSFSheet sheet = workbook.getSheet("one");
		 
		 if (sheet == null) {
             System.out.println("Sheet 'one' not found in the workbook");   
         }
		 
		 
		 int rows = sheet.getLastRowNum();
		 
		 int columns = sheet.getRow(1).getLastCellNum();
		 
		 
		 for (int r = 0; r <= rows ; r++) {
			
			XSSFRow row = sheet.getRow(r);
			 
				for (int c = 0; c < columns; c++) {
					
					XSSFCell cell = row.getCell(c);
					
					 CellType celltype = cell.getCellType();
					
				switch (celltype) {
				
					case STRING:
						
						System.out.print(cell.getStringCellValue());
						
						break;
						
					case NUMERIC:	
						
						System.out.print(cell.getNumericCellValue());
						
						break;

					}
				
				System.out.print(" "); /*To have space between data*/
					
				}
								
				System.out.println(); /*To print data to next line*/
			
		 	}
		
		 
		 workbook.close();
		 
		}

	}
