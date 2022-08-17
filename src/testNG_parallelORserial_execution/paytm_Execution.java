package testNG_parallelORserial_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paytm_Execution {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
	    
	   WebDriver driver = new ChromeDriver();
	    
	   driver.manage().window().maximize();

	   driver.get("https://paytm.com/");
  }
}
