package testNG_POM_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page 
{
//---Data member should be declared globally with access level private using 
	
   @FindBy(id="userid") private WebElement USERID;
   
   @FindBy(id="password") private WebElement PASSWORD;
   
   @FindBy(xpath="//button[@type='submit']") private WebElement LogInButton;
   
//---Initialize within a constructor with access level public using PageFactory
   
   LogIn_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
//---Utilize within a method with access level public
   
   public void senduserid(String Uid)
   {
	   USERID.sendKeys(Uid);
   }
   
   public void sendpassword(String password)
   {
	   PASSWORD.sendKeys(password);
   }
   
   public void clickLoginbutton()
   {
	   LogInButton.click();
   }


}
