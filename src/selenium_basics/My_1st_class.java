package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_1st_class {

	public static void main(String[] args) throws InterruptedException 
	{
	   //System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver.exe");

	   WebDriverManager.chromedriver().setup();
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   
	  // driver.get("https://www.mphasis.com/home.html");
	   
	  driver.get("https://pmc.gov.in/mr");   //PMC site

	   //driver.get("https://www.kpit.com/");
	  
	  Thread.sleep(5000);
	  
	  System.out.println(driver.getTitle());
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
	   
	}

}
