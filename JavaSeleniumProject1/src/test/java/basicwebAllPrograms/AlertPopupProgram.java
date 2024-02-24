package basicwebAllPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("lakshmi");
		driver.findElement(By.name("submit")).click();
		
		Alert alt= driver.switchTo().alert(); ///Do you really want to delete this Customer?--popup(alert)
        System.out.println(alt.getText());
		
//        alt.accept(); //used to select "ok" button
        
        Thread.sleep(3000);
        alt.dismiss(); //used to select "cancel" button
        
        driver.close();
		
		
	}

}
