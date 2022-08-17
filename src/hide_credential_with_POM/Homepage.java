package hide_credential_with_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
//---Data member should be declared globally with access level private using 
	
   @FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
   
   @FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
   
//---Initialize within a constructor with access level public using PageFactory
   
   public Homepage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
//---Utilize within a method with access level public
   
   public String clickuid()
   {
	   String expecteduserid = "Dhana123";
	   String Actualuserid = uid.getText();
	   
	   if(expecteduserid.equals(Actualuserid))
	   {
		   System.out.println("ExpectedUserid and Actualuserid is matching");
	   }
	   else
	   {
		   System.out.println("ExpectedUserid and Actualuserid is not matching");
	   }
	   
	   uid.click();
	   
	   return Actualuserid;
	
   }
   
   public void clickLogout()
   {
	   Logout.click();
   }
}