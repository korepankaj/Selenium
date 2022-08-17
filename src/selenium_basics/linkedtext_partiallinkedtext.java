package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtext_partiallinkedtext 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Velocity Technologies pvt ltd\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.co.in/");
	    
	   // driver.findElement(By.linkText("Gmail")).click();   //linktext
	    
	    driver.findElement(By.partialLinkText("Gma")).click();  //partial linktext
	}

}
