package synchronization_or_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9763807421");
		
		WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
		
//---Explicit wait
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(100));
		w.until(ExpectedConditions.elementToBeClickable(getotp));
		
		getotp.click();
		
		

	}

}
