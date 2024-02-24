package basicwebAllPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://automationtesting.in/#");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)"); //scroll down
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)"); //scroll up
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(300,300)"); //left to right
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-300,300)"); //right to left

	}

}
