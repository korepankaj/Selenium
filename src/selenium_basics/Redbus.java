package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbus 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.redbus.in/");
        
         Actions act = new Actions(driver);
        
        WebElement source = driver.findElement(By.id("src"));
      
        source.sendKeys("Mum");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Thane West, Mumbai']")).click();
     
        Thread.sleep(4000);
        source.clear();
        
        source.sendKeys("Latu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Latur']")).click();
           
        Thread.sleep(4000);
        
        driver.findElement(By.id("dest")).sendKeys("Pu");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li[text()='Hadapsar, Pune']")).click();
        
        driver.findElement(By.xpath("//label[text()='Date']")).click(); 
        
        Thread.sleep(2000);
        
//        for(int i=1; i<=1; i++)
//        {
//        	WebElement arrow = driver.findElement(By.xpath("//button[text()='>']"));
//        	act.click(arrow).perform();
//        	Thread.sleep(2000);
//        }
//        
//        driver.findElement(By.xpath("//button[text()='>']")).click();  //July
//        
//        Thread.sleep(2000);
//     
//        driver.findElement(By.xpath("//button[text()='>']")).click();  //August
//      
//        Thread.sleep(2000);
//      
//        driver.findElement(By.xpath("//button[text()='>']")).click();   //September
//      
//        Thread.sleep(2000);
//      
//        driver.findElement(By.xpath("//button[text()='>']")).click();   //October
//      
//        Thread.sleep(2000);
//      
//        driver.findElement(By.xpath("//button[text()='>']")).click();  //November
//      
//        Thread.sleep(2000);
//      
//        driver.findElement(By.xpath("//button[text()='>']")).click();  //December
      
        //Thread.sleep(2000);
      
        driver.findElement(By.xpath("//td[text()='10']")).click();
      
        Thread.sleep(2000);
      
        driver.findElement(By.id("search_btn")).click();
       
        Thread.sleep(10000);
      
        driver.findElement(By.xpath("//span[text()='Ok, got it']")).click();
      
        Thread.sleep(10000);
      
	    driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
	    //act.click(viewseat).perform();

	}

} 