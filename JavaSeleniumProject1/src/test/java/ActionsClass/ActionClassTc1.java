package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ActionClassTc1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		FirefoxDriver driver = new FirefoxDriver() ;
		driver.get("https://automationtesting.in/#");
		

		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/nav/ul/li[7]/a")).click();
		Actions act =new Actions(driver);

		WebElement Button = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/nav/ul/li[7]/a"));
		act.moveToElement(Button).click().build().perform();
		
		WebElement Button1=driver.findElement(By.linkText("SwitchTo"));
		act.moveToElement(Button1).click().build().perform();
//		WebElement Button2 = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));

//		act.moveToElement(Button).click().build().perform();
//		act.moveToElement(Button1).click().build().perform();
//		act.moveToElement(Button2).click().build().perform();

//act.moveToElement(Button).moveToElement(Button1).moveToElement(Button2).click().build().perform();


		
	}

}
