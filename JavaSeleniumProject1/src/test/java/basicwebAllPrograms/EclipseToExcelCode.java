package basicwebAllPrograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EclipseToExcelCode {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream file= new FileOutputStream("C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//Book5.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Data");
		
		
		for(int i=0;i<=2;i++) {
			
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<=2;j++) {
				
				row.createCell(j).setCellValue("lakshmi");
			}
			
		}
		
		

	}

}
