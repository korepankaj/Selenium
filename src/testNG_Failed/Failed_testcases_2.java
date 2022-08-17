package testNG_Failed;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_testcases_2 
{
	 @Test 
	  public void d()
	  {
		  Reporter.log("This is d",true);
	  }
	  
	  @Test
	  public void e()
	  {
		  //Assert.fail();
		  Reporter.log("This is e",true);
	  }
	  
	  @Test 
	  public void f()
	  {
		  Reporter.log("This is f",true);
	  }
}
