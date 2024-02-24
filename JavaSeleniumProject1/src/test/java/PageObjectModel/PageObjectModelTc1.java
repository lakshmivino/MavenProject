package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelTc1 {

	
		
		WebDriver driver;
		
//		By Link = By.linkText("REGISTER");
//	    By Firstname = By.name("firstName");
		
		@FindBy(name="REGISTER")
		WebElement Register;
		
		@FindBy(name="Firstname")
		WebElement firstName;
	    
	    //constructor
	    public PageObjectModelTc1(WebDriver d) {
	    	driver =d;
	    	PageFactory.initElements(d, this);
		}
	    
	    
//	    public void RegLink() {
//	    	driver.findElement(Link).click();
//	    }
//	    public void setfirstname(String fname) {
//	    	driver.findElement(Firstname).sendKeys(fname);
//	    }
	
	    public void Register() {
	    	Register.click();
	    }
	    
	    public void SetFirstname(String fname) {
	    	firstName.sendKeys(fname);
	    }
	
	
}


