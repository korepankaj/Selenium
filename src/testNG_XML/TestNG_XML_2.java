package testNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_XML_2 {
  @Test (priority = 1)
  public void d() 
  {
	  Reporter.log("Hello my name is d",true);
  }
  
  @Test (priority = -1)
  public void e() 
  {
	  Reporter.log("Hello my name is e",true);
  }
  
  @Test (priority = -2)
  public void f() 
  {
	  Reporter.log("Hello my name is f",true);
  }
}
