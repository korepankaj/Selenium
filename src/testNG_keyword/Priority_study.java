package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_study {
  @Test(priority = -4)
  public void a_priority() 
  {
	  Reporter.log("This is a priority",true);
  }
  
  @Test(priority = 4)
  public void b_priority() 
  {
	  Reporter.log("This is b priority",true);
  }
  
  @Test(priority = 3)
  public void c_priority() 
  {
	  Reporter.log("This is c priority",true);
  }
  
  @Test(priority = 2)
  public void d_priority() 
  {
	  Reporter.log("This is d priority",true);
  }
  
  @Test(priority = 4)
  public void e_priority() 
  {
	  Reporter.log("This is e priority",true);
  }
  
  @Test
  public void f_priority() 
  {
	  Reporter.log("This is f priority",true);
  }
}
