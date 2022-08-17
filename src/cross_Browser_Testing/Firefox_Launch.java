package cross_Browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Firefox Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");

	}

}
