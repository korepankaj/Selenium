package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innvocation_count 
{
  @Test(invocationCount = 5)
  public void InnvocationcountStudy() 
  {
	  Reporter.log("This is Innovocation count study",true);
  }
}
