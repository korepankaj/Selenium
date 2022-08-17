package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods 
{
	 @Test
	  public void a() 
	  {
		  Reporter.log("This is a priority",true);
	  }
	  
	  @Test (dependsOnMethods = {"c"})
	  public void b() throws InterruptedException 
	  {
		  Thread.sleep(1000);
		  Reporter.log("This is b priority",true);
	  }
	  
	  @Test 
	  public void c() throws InterruptedException 
	  {
		  
		  Reporter.log("This is c priority",true);
	  }
	  
	  @Test
	  public void d() throws InterruptedException 
	  {
		  Thread.sleep(10000);
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
