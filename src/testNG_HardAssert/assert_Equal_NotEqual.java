package testNG_HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_Equal_NotEqual 
{
  @Test
  public void f() 
  {
	  String a = "Pune";
	  String b = "Pune";
	  String c = "Latur";
	  
//If a & b are equal test case should be passed 

//I want to verify a equal b, equal c we will be using Hard assert to verify 
	  
	 Assert.assertEquals(a, c,"A is not equal to c TC is failed");
	  
	 Assert.assertNotEquals(a, b,"A & B are equal hence TC is failed");
  }
}
