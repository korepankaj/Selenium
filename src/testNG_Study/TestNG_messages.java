package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_messages {
  @Test
  public void messages() 
  {
	  System.out.println("Hello My name is Pankaj");
	  
	  Reporter.log("Hi This is TestNG class");
	  
	  Reporter.log("Hello this is testNG report",false);
	  
  }
}
