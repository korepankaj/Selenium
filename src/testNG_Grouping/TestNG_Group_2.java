package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group_2 
{
  @Test
  public void d() 
  {
	  Reporter.log("Hello i am from d",true);
  }
  
  @Test (groups = {"Sanity"})
  public void e() 
  {
	  Reporter.log("Database analyst and tester is involved in sanity testing",true);
	  Reporter.log("In sanity testing we check Basic functionality, tab, Link, Page and GUI",true);
  }
  
  @Test (groups = {"Regression"})
  public void f() 
  {
	  Reporter.log("In Regression testing we check High priority test cases",true);
	  Reporter.log("Also we check failed test cases",true);
  }
  
  @Test
  public void g() 
  {
	  Reporter.log("Hello i am from g",true);
  }
}
