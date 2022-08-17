package end_to_end_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
	   
	    String expectedUID = "ELR321";
	    String actualUID = UID.getText();
	    System.out.println("Actual result : "+actualUID);
	    System.out.println();
	    System.out.println("Expected result : "+expectedUID);
	    System.out.println();
	    
	    if(expectedUID.equals(actualUID))
	    {
	    	System.out.println("Actual and Expected result is matching");
	    }
	    else
	    {
	    	System.out.println("Actual and Expected result is not matching");
	    }
	    
	    UID.click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    
	    //driver.close();
	}

}
