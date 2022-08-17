package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {
  @Test
  public void ValidateUserID() 
  {
	  Reporter.log("User id is validated",true);
  }

  @BeforeMethod
  public void login()
  {
	Reporter.log("Log in done",true);  
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("Log out done",true);
  }
}