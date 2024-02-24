package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		
		driver.get("https://github.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("lakshmivinod214@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lakshmi@4c0");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.className("Button-label")).click();
		driver.findElement(By.linkText("settings")).click();
		
		
	}

}
