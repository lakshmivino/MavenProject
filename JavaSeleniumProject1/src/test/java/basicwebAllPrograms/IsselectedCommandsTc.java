package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsselectedCommandsTc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://testautomationpractice.blogspot.com/");
		
		boolean isDisplay= driver.findElement(By.name("gender")).isDisplayed(); //conditional commands
		System.out.println(isDisplay);
		
		boolean isEnable= driver.findElement(By.name("gender")).isEnabled();
		System.out.println(isEnable);
		
		boolean isselected= driver.findElement(By.name("gender")).isSelected();
		System.out.println(isselected);
		
		driver.findElement(By.id("female")).click();
		boolean isselected1= driver.findElement(By.id("female")).isSelected();
		System.out.println(isselected1);
		
		driver.close();
		

	}

}
