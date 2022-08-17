package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG_All_Annotation {
  @Test
  public void Test() 
  {
	  Reporter.log("This is only test method",true);
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("This is Before suite method",true);
  }
  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("This is After suite method",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is Before method",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This is After Method",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("This is Before class",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This is After class",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("This is Before Test",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("This is After Test",true);
  }
}
