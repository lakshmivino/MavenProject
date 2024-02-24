package basicwebAllPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToEclipseApachePoiTc2 {

	public static void main(String[] args) throws IOException {
		
	//tc will told that reading all the data present in excelsheet to java through thirdparty tool ApachePoi
		                                            
				
		FileInputStream file = new FileInputStream("C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//Book5.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("sheet1");
		int  row= sheet.getLastRowNum();
		int col= sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row;i++) {
		XSSFRow Currentrow = sheet.getRow(i);
		
		for(int j=0;j<col;j++) {
			
			String col1=Currentrow.getCell(j).toString();
			System.out.print("   " +col1);
			
		}
		System.out.println();
		
	}

}
}
