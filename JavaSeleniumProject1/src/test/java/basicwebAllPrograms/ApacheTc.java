package basicwebAllPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApacheTc {

	public static void main(String[] args) throws IOException {
		
	
		
		FileInputStream file = new FileInputStream("C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//Book1.xlsx");
		XSSFWorkbook  workbook= new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int coloumncount = sheet.getRow(0).getLastCellNum();
		
		
		for(int i = 0; i<rowcount; i++ )
		{
		XSSFRow currentrow=sheet.getRow(i);
		for(int j = 0;j<coloumncount;j++)
		{
			String value = currentrow.getCell(j).toString();
			System.out.print("" +value);
		}
		System.out.println();
		}
		
		
	}

}
