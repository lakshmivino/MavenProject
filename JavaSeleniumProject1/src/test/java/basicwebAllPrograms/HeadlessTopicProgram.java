package basicwebAllPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class HeadlessTopicProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
//        FirefoxOptions options = new FirefoxOptions();-----1
//         options.setHeadless(true);-----2    These 2 lines can run the program behind the window and produce the output
		
//        headless program means it will perform the task behind the window.Remaining program is same for before
		
         WebDriver driver = new FirefoxDriver();
         driver.get("https://demo.guru99.com/test/newtours/login_sucess.php");
        driver.close();
        
        
	}

}
