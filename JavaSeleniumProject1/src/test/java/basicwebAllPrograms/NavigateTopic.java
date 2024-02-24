package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTopic {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		//Navigate topic
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com/");
	    driver.navigate().back();
	    driver.navigate().to("https://www.flipkart.com/");
	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.quit();

	}

}
