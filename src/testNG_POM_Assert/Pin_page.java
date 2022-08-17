package testNG_POM_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page
{
//---Data member should be declared globally with access level private using 
	
   @FindBy(id = "pin" ) private WebElement PIN;
   
   @FindBy(xpath = "//button[@type='submit']") private WebElement Submitbutton;
   
//---Initialize within a constructor with access level public using PageFactory
   
   Pin_page(WebDriver driver) 
   {
	  PageFactory.initElements(driver, this);
   }
   
//---Utilize within a method with access level public
   
   public void sendpin(String pin)
   {
	   PIN.sendKeys(pin);
   }
   
   public void clicksubmitbutton()
   {
	   Submitbutton.click();
   }

}


