package testNGListner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListner.Listener.class) 

public class Listen {
  @Test
  public void method1() 
  {
	  Reporter.log("Mymethod1 --> TC execution is started",true);
  }
  
  @Test
  public void method2() 
  {
	  Assert.fail();
	  Reporter.log("Mymethod2 --> TC execution is started",true);
  }
  
  @Test  (dependsOnMethods = {"method2"})
  public void method3() 
  {
	  Reporter.log("Mymethod3 --> TC execution is started",true);
  }
}
