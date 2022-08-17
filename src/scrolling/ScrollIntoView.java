package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://vctcpune.com/");
			
		 Thread.sleep(2000);
		 
		 WebElement seleniumpractice = driver.findElement(By.xpath("//a[contains(text(),'Click to')]"));
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView();",seleniumpractice);
		 
		 

	}

}
