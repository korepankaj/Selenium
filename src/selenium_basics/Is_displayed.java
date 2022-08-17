package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Velocity Technologies pvt ltd\\\\Automation Testing\\\\Selenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		Thread.sleep(4000);
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement Hide = driver.findElement(By.id("hide-textbox"));
		
		Hide.click();
		
		Thread.sleep(4000);
		
		if(textbox.isDisplayed())
		{
			System.out.println("Textbox is displayed");
			textbox.sendKeys("Welcome");
		}
		else
		{
			System.out.println("Textbox is not displayed click on show button");
			
			show.click();
			
			Thread.sleep(4000);
			
			textbox.sendKeys("Welcome to velocity");
			
			
		}

	}
}
