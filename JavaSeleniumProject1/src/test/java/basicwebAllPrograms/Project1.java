package basicwebAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("userName")).sendKeys("lakshmi");
		driver.findElement(By.name("lastName")).sendKeys("vankadara");
		driver.findElement(By.name("phone")).sendKeys("8763547298478");
		driver.findElement(By.name("userName")).sendKeys("lakshmivinod214@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Hyderabad");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500089");
		Select sel = new Select(driver.findElement(By.name("country")));// dropdown method
		sel.selectByValue("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("Lakshmivinod");
		driver.findElement(By.name("password")).sendKeys("Hyderabad");
		driver.findElement(By.name("confirmPassword")).sendKeys("Hyderabad");
		driver.findElement(By.name("submit")).click();
	
	}

}
