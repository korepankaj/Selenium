package CT_Parallel_serial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_testing 
{
  @Test
  public void f() 
  {
      System.setProperty("webdriver.gecko.driver","D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Firefox Driver\\geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.birlasoft.com/");
  }
}
