package testNG_a_Testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hide_credential_with_POM.Homepage;
import hide_credential_with_POM.LogIn_Page;
import hide_credential_with_POM.Pin_page;
import testNG_a_base.Base;
import testNG_a_base.Base_property;
import testNG_a_utility.Utility;
import testNG_a_utility.Utility_Property;

@Listeners(testNG_a_utility.Listener.class)

public class Validation_page_Property extends Base_property
{
	Homepage home;
	LogIn_Page login;
	Pin_page pin;
	
  @BeforeClass
  public void launchBrowser() throws IOException
  {
	   openApplication();
	   
	   login = new LogIn_Page(driver);
	   pin = new Pin_page(driver);
	   home = new Homepage(driver);
  }
  
  @BeforeMethod
  public void loginzerodha() throws EncryptedDocumentException, IOException
  {
	  login.senduserid(Utility_Property.readDatafrompropertyfile("UN"));
	  login.sendpassword(Utility_Property.readDatafrompropertyfile("PWD"));
	  login.clickLoginbutton();
	  
	  pin.sendpin(Utility_Property.readDatafrompropertyfile("PIN"));
	  pin.clicksubmitbutton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
  }
  
  @Test
  public void f() throws EncryptedDocumentException, IOException 
  {
	  String TCID = "123456789";
	  Assert.assertEquals(home.clickuid(), Utility_Property.readDatafrompropertyfile("UN1"),"Test case failed actual and expected userid is not matched");
	  //Assert.fail();
	  //Utility.capturescreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logout()
  {
	  home.clickLogout();
  }
}
