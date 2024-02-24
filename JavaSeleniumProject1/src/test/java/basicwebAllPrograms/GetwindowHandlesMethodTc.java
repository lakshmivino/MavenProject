package basicwebAllPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetwindowHandlesMethodTc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.linkText("click")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Set <String> k =driver.getWindowHandles();
		
		for(String i:k) {
			
		System.out.println(i);
		String	m=driver.switchTo().window(i).getTitle();
		System.out.println(m);
		
		if(m.equals("Frames & windows")) {
			
			driver.close();
		}
		}
		

	}

}
