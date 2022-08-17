package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
		//OK
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(2000);
		Alert ok = driver.switchTo().alert();
	    System.out.println(ok.getText());
	    ok.accept();
	  
	    //Dismiss 
	    driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
	    Thread.sleep(2000);
	    Alert cancel = driver.switchTo().alert();
	    System.out.println(cancel.getText());
	    cancel.dismiss();
	    System.out.println(driver.findElement(By.id("demo")).getText());
	    
	    //prompt box
	    driver.findElement(By.xpath("//button[@onclick='myFunctionThree()']")).click();
	    Alert promptbox = driver.switchTo().alert();
	    System.out.println(promptbox.getText());
	    Thread.sleep(5000);
	    promptbox.sendKeys("Yes");
	    promptbox.accept();
	    System.out.println(driver.findElement(By.id("demoone")).getText());
	    
	   
	}

}
