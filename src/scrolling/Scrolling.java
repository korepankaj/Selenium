package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://vctcpune.com/selenium/practice.html");
			
		 Thread.sleep(2000);
		 
//---Typecast
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-500)");
		 
		 
		 

	}

}
