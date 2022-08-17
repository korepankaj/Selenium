package testNGListner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import testNG_a_base.Base_property;
import testNG_a_utility.Utility;

public class Listener extends Base_property implements ITestListener
{
	Base_property bp = new Base_property();
	
   @Override
   public void onTestStart(ITestResult result) 
   {
	  Reporter.log("TC execution is started "+result.getName(),true);
   }
	
   @Override
	public void onTestSkipped(ITestResult result) 
   {
	   Reporter.log("TC execution is skipped "+result.getName(),true);
   }
   
   public void onTestFailure(ITestResult result) 
    {
	   Reporter.log("TC execution is failed "+result.getName(),true);
	   try {
		bp.capturescreenshot(result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

    @Override
    public void onTestSuccess(ITestResult result) 
    {
    	Reporter.log("TC execution is successful "+result.getName(),true);	
    }
}
