package testNG_POM_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage 
{
//---Data member should be declared globally with access level private using 
	
   @FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
   
   @FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
   
//---Initialize within a constructor with access level public using PageFactory
   
   Homepage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
//---Utilize within a method with access level public
   
//   public void clickuid()
//   {
//	   String expecteduserid = "Dhana123";
//	   String Actualuerid = uid.getText();
//	   
//	   if(expecteduserid.equals(Actualuerid))
//	   {
//		   System.out.println("ExpectedUserid and Actualuserid is matching");
//	   }
//	   else
//	   {
//		   System.out.println("ExpectedUserid and Actualuserid is not matching");
//	   }
//	   
//	   uid.click();
//   }

   public String Actualuid()
   {
	   String Actualuid = uid.getText();
	   return Actualuid;
   }
   
   public void clickLogout()
   {
	   uid.click();
	   Reporter.log("Clicking on UserID",true);
	   Logout.click();
	   Reporter.log("Click on LogOut Button",true);
   }
   
}
