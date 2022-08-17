package testNG_Failed;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_testcases
{
	 @Test 
	  public void a()
	  {
		  Reporter.log("This is a",true);
	  }
	  
	  @Test
	  public void b()
	  {
		  Reporter.log("This is b",true);
	  }
	  
	  @Test 
	  public void c()
	  {
		 // Assert.fail();
		  Reporter.log("This is c",true);
	  }
}
