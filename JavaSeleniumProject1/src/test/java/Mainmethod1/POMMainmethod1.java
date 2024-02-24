package Mainmethod1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.PageObjectModelTc1;

public class POMMainmethod1 {

		
		public void FlightLink() {
			
			System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
			WebDriver driver = new FirefoxDriver() ;
			
			PageObjectModelTc1 model = new PageObjectModelTc1(driver); // calling this method from PageObjectModelTc1 program
			driver.get("https://demo.guru99.com/test/newtours/");
			
			model.Register();
			model.SetFirstname("lakshmi");

	}

}
