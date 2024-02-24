package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://automationtesting.in/#");
        
		driver.findElement(By.linkText("Demo Site")).click();
		
		Actions act= new Actions(driver);
		WebElement button =  driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
	    act.moveToElement(button).click().build().perform();
	    
	    Runtime.getRuntime().exec("C:\\Users\\HP-LAPTOP\\Desktop\\harika\\Selenium Java Lakshmi\\AutoItFileUploadProgram.exe")	  ;  
	    
//	    Robot rb = new Robot();
//	    StringSelection str = new StringSelection("C:\\Users\\HP-LAPTOP\\Desktop\\harika\\Selenium Java Lakshmi\\phonepic.png");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//	    
//	    Thread.sleep(1000);
//	    rb.keyPress(KeyEvent.VK_CONTROL);
//	    rb.keyPress(KeyEvent.VK_V);
//	    
//	    Thread.sleep(1000);
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	    
//	    Thread.sleep(1000);
//	    rb.keyPress(KeyEvent.VK_ENTER);
//	    rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
