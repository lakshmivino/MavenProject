package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

		@Test(dataProvider="Data")
		public void Lakshmi(String name1, String name2,String name3) {
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(name3);
		}
		
		@DataProvider(name="TestData1")
		public Object[][] testData(){
			Object[][] data = new Object[1][3];
			
			data[0][0]=  "Geetha";
			data[0][1]=  "vinod";
		    data[0][2]=  "harika";
		    return data;
		}
		
		@DataProvider(name="Data")
		public Object[][] testData1(){
			Object[][] data = new Object[1][3];
			
			data[0][0]=  "Geetha1";
			data[0][1]=  "vinod1";
		    data[0][2]=  "harika1";
		    return data;
		}

	}


