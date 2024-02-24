package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderTc1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//date button 
		
		for(int i=5;i>=1;i--) {
			driver.findElement(By.linkText("Next")).click(); //button
			String m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //month
			
			
			if(m.equals("July")){
				
				driver.findElement(By.linkText("26")).click(); //day 
			}
			
	//html/body/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div/div[4]/div[9]/div[2]/
		}

	}

}

