package testNG_a_Testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hide_credential_with_POM.Homepage;
import hide_credential_with_POM.LogIn_Page;
import hide_credential_with_POM.Pin_page;
import testNG_a_base.Base;
import testNG_a_utility.Utility;

public class Validation_page extends Base
{
	Homepage home;
	LogIn_Page login;
	Pin_page pin;
	
  @BeforeClass
  public void launchBrowser()
  {
	   openApplication();
	   
	   login = new LogIn_Page(driver);
	   pin = new Pin_page(driver);
	   home = new Homepage(driver);
  }
  
  @BeforeMethod
  public void loginzerodha() throws EncryptedDocumentException, IOException
  {
	  login.senduserid(Utility.readdatafromexcel(0, 0));
	  login.sendpassword(Utility.readdatafromexcel(0, 1));
	  login.clickLoginbutton();
	  
	  pin.sendpin(Utility.readdatafromexcel(0, 2));
	  pin.clicksubmitbutton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  
  }
  
  @Test
  public void f() throws EncryptedDocumentException, IOException 
  {
	  String TCID = "1234";
	  Assert.assertEquals(home.clickuid(), Utility.readdatafromexcel(0, 0),"Test case failed actual and expected userid is not matched");
	  Utility.capturescreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logout()
  {
	  home.clickLogout();
  }
}
