package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
                
//---create object of actions class and pass driver object  as parameter        
       Actions act = new Actions(driver);
       
       Thread.sleep(2000);
       
//---find the element to be worked and stored in reference variable       
       WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
       
//---take required action
      // act.moveToElement(right).contextClick().build().perform();
       
       act.contextClick(right).perform();
       
    }

}
