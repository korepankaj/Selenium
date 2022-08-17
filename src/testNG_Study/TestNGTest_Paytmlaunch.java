package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTest_Paytmlaunch 
{
	@Test
	  public void launchpaytm() 
	  {
		   System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		    
		   WebDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();

		   driver.get("https://paytm.com/");
		   
		   driver.close();
		   
	  }
 
}
