package testNG_a_base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import testNG_a_utility.Utility_Property;

public class Base_property 
{
	protected static WebDriver driver;
	public void openApplication() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Utility_Property.readDatafrompropertyfile("URL"));
		
		Reporter.log("Launching Kite App");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
    public void capturescreenshot(String TestCaseID) throws IOException
	{
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
	   File dest = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\TC"+TestCaseID+".png");
		  
	   FileHandler.copy(src, dest);
		  
	   Reporter.log("Take screenshot");
	}
	
}
