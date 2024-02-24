package SikuliThirdPartyTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTc1 {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		FirefoxDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Actions act = new Actions(driver);
		// to upload the file
		
      WebElement button =  driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
      act.moveToElement(button).click().build().perform();
      
      String textbox =  "C:\\Users\\HP-LAPTOP\\Desktop\\harika\\Selenium Java Lakshmi\\"; //path for both textbox and openbutton
      String inputfile ="C:\\Users\\HP-LAPTOP\\Desktop\\harika\\Selenium Java Lakshmi\\"; //path for pic to open in button
      
      Screen s= new Screen(); //predefined class in Sikuli
      
      Pattern inputtextbox= new Pattern(textbox+ "Textbox.png.png"); //path for textbox + name of the textbox
      Pattern openbutton1 = new Pattern(textbox+ "Openbutton.png.png"); //path of openbutton + name of button in the path
      
      Thread.sleep(2000);
      s.wait(inputtextbox,20);
      s.type(inputtextbox,inputfile+"phonepic.png"); //typing these info in the window to open the pic
      s.click(openbutton1);
      
      
      
      

	}

}
