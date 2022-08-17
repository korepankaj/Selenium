package testNG_SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNull_NotNull 
{
  @Test
  public void f() 
  {
       String a = "Pankaj";
       String b = null;
       
       SoftAssert soft = new SoftAssert();
       
       soft.assertNotNull(b,"Test case is failed value is null");
       soft.assertNull(a,"Test case is failed value is not null");
       
       soft.assertAll();
  }
}
