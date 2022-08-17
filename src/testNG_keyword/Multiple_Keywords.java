package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_Keywords
{
	 @Test
	  public void a() 
	  {
		  Reporter.log("This is a priority",true);
	  }
	  
	  @Test (dependsOnMethods = {"c"}, invocationCount = 3)
	  public void b() throws InterruptedException 
	  {
		  
		  Reporter.log("This is b priority",true);
	  }
	  
	  @Test 
	  public void c()  
	  {
		  
		  Reporter.log("This is c priority",true);
	  }
	  
	  @Test
	  public void d() 
	  {
		  
		  Reporter.log("This is d priority",true);
	  }
	  
	  @Test
	  public void e() 
	  {
		  Reporter.log("This is e priority",true);
	  }
	  
	  @Test
	  public void f() 
	  {
		  Reporter.log("This is f priority",true);
	  }

  
}
