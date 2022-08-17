package testNG_a_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_Property 
{
  public static String readDatafrompropertyfile(String key) throws IOException
  {
	  Properties prop = new Properties();  //create object of property
	  
	  FileInputStream myFile = new  FileInputStream("C:\\Users\\panka\\eclipse-workspace\\Velocity selenium training pvt ltd\\Myproperty.properties");
	  
	  prop.load(myFile); //loaded the file
	  
	  String value = prop.getProperty(key);
	  
	  return value;
  }
  
  public static void capturescreenshot(WebDriver driver, String TestCaseID) throws IOException
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\TC"+TestCaseID+".png");
	  
	  FileHandler.copy(src, dest);
	  
	  Reporter.log("Take screenshot");
  }
}
