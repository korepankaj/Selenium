package synchronization_or_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//---Implicitly wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
	    driver.findElement(By.id("btn1")).click();
	    
	    System.out.println("Button 1 is clicked");
	    
	    driver.findElement(By.id("txt1")).sendKeys("Pankaj");

	}

}
