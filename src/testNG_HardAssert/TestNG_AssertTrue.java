package testNG_HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertTrue {
  @Test
  public void asserttrue_false() 
  {
	  boolean a = true;
	  boolean b = false;
	  
//I want verify a value is true or not
	  
	  //Assert.assertTrue(b,"Test case is failed");
	  
	  Assert.assertFalse(b,"Test case is passed");
  }
}
