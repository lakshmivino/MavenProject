package basicwebAllPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotProgram {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/");
		
		TakesScreenshot pic =((TakesScreenshot)driver);
		File SrcFile = pic.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("C:\\Users\\HP-LAPTOP\\Documents\\lakshmi java\\JavaSeleniumProject1\\src\\test\\resources\\ScreenShot1.png");
		FileUtils.copyFile(SrcFile, DestFile);
		
		driver.close();

	}

}
