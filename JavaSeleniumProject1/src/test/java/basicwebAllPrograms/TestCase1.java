package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String exp_title= "Login: Mercury Tours";
		String act_title= driver.getTitle();
		System.out.println(act_title);
		
		if(exp_title.equals(act_title)) {
			System.out.println("tc is passed");
		}
		else
		{
			System.out.println("tc is failed");
		}
		driver.quit();
	
		

	}

}
