package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage_Zerodha 
{
//---Data member should be declared globally with access level private using 
		
	   @FindBy(id = "userid") private WebElement userID;
	   @FindBy(id = "password") private WebElement Password;
	   @FindBy(xpath = "//button[@type='submit']") private WebElement LogINbutton;
	   
//---Initialize within a constructor with access level public using PageFactory
	   
	   LogInPage_Zerodha(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
//---Utilize within a method with access level public 
	   
	   public void sendUserId()
	   {
		   userID.sendKeys("ELR321");
	   }

	   public void sendpassword()
	   {
		   Password.sendKeys("Dhana1111");
	   }
	   
	   public void clickLogin()
	   {
		   LogINbutton.click();
	   }
}
