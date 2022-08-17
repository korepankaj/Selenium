package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group_1 
{
  @Test
  public void a() 
  {
	  Reporter.log("hello my name is a",true);
  }
  
  @Test (groups = {"Sanity"})
  public void b() 
  {
	  Reporter.log("Sanity is a zero level testing",true);
	  Reporter.log("In sanity testing we have to check basic functionality of the application",true);
  }
    
  @Test (groups = {"Regression"})
  public void c() 
  {
	  Reporter.log("In regression testing we check newly corrected or newly added functionality is proper work or not",true);
	  Reporter.log("Also we check it is impact of another functionality or not",true);
  }
 
}
