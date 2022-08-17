package testNGListner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Listen2 {
  @Test
  public void method4() 
  {
	  Reporter.log("Mymethod4 --> TC execution is started",true);
  }
  
  @Test
  public void method5() 
  {
	  Assert.fail();
	  Reporter.log("Mymethod5 --> TC execution is started",true);
  }
  
  @Test  (dependsOnMethods = {"method5"})
  public void method6() 
  {
	  Reporter.log("Mymethod6 --> TC execution is started",true);
  }
}
