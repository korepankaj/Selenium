package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Velocity Technologies pvt ltd\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Automation Testing\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//selenium focuses default on main page
		//we need to switch selenium focus from main page to frame
		driver.switchTo().frame("iframeResult");
		
		//Thread.sleep(2000);
		
		//this element is present in iframe
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

	}

}