package testNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_XML_1 {
  @Test (priority = 4)
  public void a()
  {
	  Reporter.log("This is a",true);
  }
  
  @Test (priority = 3)
  public void b()
  {
	  Reporter.log("This is b",true);
  }
  
  @Test (priority = 2)
  public void c()
  {
	  Reporter.log("This is c",true);
  }
}
