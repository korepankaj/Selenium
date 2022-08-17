package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_zerodha 
{
//---Data member should be declared globally with access level private using 
	
   @FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
   
   @FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
   
//---Initialize within a constructor with access level public using PageFactory

   Homepage_zerodha(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
//---Utilize within a method with access level public 
   
   public void clickUserid()
   {
	   String Expectedresult = "ELR321";
	   String Actualresult = UserID.getText();
	   
	   if(Expectedresult.equals(Actualresult))
	   {
		   System.out.println("Expected result and actual result is matching");
	   }
	   else
	   {
		   System.out.println("Expected result and actual result is not matching");
	   }
	   
   }
   
   public void clickLogOut() throws InterruptedException
   {
	   UserID.click();
	   Thread.sleep(1000);
	   LogOut.click();
   }
 }
