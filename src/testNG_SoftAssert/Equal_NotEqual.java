package testNG_SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Equal_NotEqual {
  @Test
  public void f() 
  {
	  
	  String a = "Pune";
	  String b = "Pune";
	  String c = "Latur";
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertEquals(a, c,"A and C are not equal Test case is failed");
	  
	  soft.assertNotEquals(a,b,"A and B are equal Test case is failes");
	  
	  soft.assertAll();
  }
}
