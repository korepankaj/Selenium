package cross_Browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_testing {
  @Parameters("Browsername")
  @Test
  public void CT(String Browsername) 
  {
	  WebDriver driver = null;      //declare driver here
	  
	  if(Browsername.equals("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver.exe");

	      driver = new ChromeDriver();
	  }
	  else if(Browsername.equals("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Firefox Driver\\geckodriver.exe");
	  
	      driver = new FirefoxDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
   }
}
