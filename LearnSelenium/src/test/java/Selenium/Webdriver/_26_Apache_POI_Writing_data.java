package Selenium.Webdriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _26_Apache_POI_Writing_data {

	public static void main(String[] args) throws IOException {
		
		/*Creating workbook and worksheet*/
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet SheetOne = workbook.createSheet("SheetOne");
		
		
		/*Provided data*/
		Object[][] data = {{"Name","Location","Experience"},
							{"Vishal","Mumbai",3},
							{"Arun","Chennai",5},
							{"Rahul","Pune",7}
						  };
		
		
		/*creating rows an column*/
		int rows = data.length ;
		
		int col = data[0].length ;
		
		for (int r=0; r<rows; r++) {
			
			XSSFRow row = SheetOne.createRow(r);
			
				for (int c=0; c<col; c++) {
					
					XSSFCell cell = row.createCell(c);
				
					Object CellData = data[r][c];
					
					
					if (CellData instanceof String) {
						
						cell.setCellValue((String)CellData);
						
					}	else if (CellData instanceof Integer) {
						
						cell.setCellValue((Integer)CellData);
						
					}
					
					
					
				}
			
		}	
		
		/*Path specified*/
		File file = new File(System.getProperty("user.dir")+"\\Demo_File\\New.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		
		
		workbook.close();

	}

}
