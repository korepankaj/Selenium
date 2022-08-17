package testNG_HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_NotNull 
{
  @Test
  public void f() 
  {
	  String a = "Null";
	  String b = "Pune";
	  
	  //Assert.assertNull(b, "Given value is not null hence TC is failed");
	  
	  Assert.assertNotNull(b, "Hence given value is not null TC is Passed");
			  
  }
}
