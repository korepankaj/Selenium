package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_study 
{
	 @Test
	  public void a_priority() 
	  {
		  Reporter.log("This is a priority",true);
	  }
	  
	  @Test
	  public void b_priority() 
	  {
		  Reporter.log("This is b priority",true);
	  }
	  
	  @Test
	  public void c_priority() 
	  {
		  Reporter.log("This is c priority",true);
	  }
	  
	  @Test
	  public void d_priority() 
	  {
		  Reporter.log("This is d priority",true);
	  }
	  
	  @Test(enabled = false)
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
