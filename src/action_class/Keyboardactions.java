package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://en-gb.facebook.com/");
        
        Thread.sleep(2000);
        
        Actions act = new Actions(driver);    
       
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
        Thread.sleep(2000);
        
//---Day        
        
        WebElement day = driver.findElement(By.id("day"));
        act.click(day).perform();
        
        //---Using for loop
        for(int i=1; i<=14; i++)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(1000);
        }
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
        act.sendKeys(Keys.ENTER).perform();
        
 //---Month
        WebElement month = driver.findElement(By.id("month"));
        act.click(month).perform();
        
        //---Using for loop
        for(int i=1; i<=5; i++)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(1000);
        }
        
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform(); 
//        Thread.sleep(1000); 
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000); 
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(1000);
        act.sendKeys(Keys.ENTER).perform();
        
//---Year
       WebElement year = driver.findElement(By.id("year"));
       act.click(year).perform();
       
       for(int i=1; i<=30; i++)
       {
    	   act.sendKeys(Keys.ARROW_DOWN).perform();
    	   Thread.sleep(1000);
       }
       
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//    	 Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
//       act.sendKeys(Keys.ARROW_DOWN).perform();
//       Thread.sleep(1000);
         act.sendKeys(Keys.ENTER).perform();   
             
	}
	

}
