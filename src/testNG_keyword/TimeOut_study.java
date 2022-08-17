package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_study 
{
	 @Test
	  public void a_priority() 
	  {
		  Reporter.log("This is a priority",true);
	  }
	  
	  @Test(timeOut = 5000)
	  public void b_priority() throws InterruptedException 
	  {
		  Thread.sleep(1000);
		  Reporter.log("This is b priority",true);
	  }
	  
	  @Test
	  public void c_priority() 
	  {
		  Reporter.log("This is c priority",true);
	  }
	  
	  @Test(timeOut = 5000)
	  public void d_priority() throws InterruptedException 
	  {
		  Thread.sleep(10000);
		  Reporter.log("This is d priority",true);
	  }
	  
	  @Test
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
