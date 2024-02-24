package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String Value=driver.findElement(By.name("submit")).getAttribute("type");
		System.out.println(Value);

		String value2=driver.findElement(By.name("submit")).getCssValue("border-collapse");
		 //need to see that cssvalue at rightside as computed type
		System.out.println(value2);
		
		String value1=driver.findElement(By.name("submit")).getTagName();
		System.out.println(value1);
		
		String value=driver.findElement(By.name("submit")).getCssValue("appearance");
		System.out.println(value);
		
		
	}

}
