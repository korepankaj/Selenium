package javascriptexecutor_click_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_sendkeys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
			
		Thread.sleep(2000);
		
//--- Sendkeys method by using javascriptexecutor
		
		WebElement countries = driver.findElement(By.id("autocomplete"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].value='India';", countries);
		
		Thread.sleep(2000);
		
//--- Click method by using javascriptexecutor
		
		WebElement aboutusbutton = driver.findElement(By.id("checkBoxOption3"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
		jsExecutor.executeScript("arguments[0].click();",aboutusbutton);
		

	}

}
