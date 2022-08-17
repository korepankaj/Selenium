package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_ClickAndHold {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
//---create object of actions class and pass driver object as parameter 
        Actions act = new Actions(driver);
        
//---find the element to be worked and stored in reference variable 
       WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
       WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
       
//---now take action
       act.dragAndDrop(source, dest).perform();
       
//---find the element to be worked and stored in reference variable 
       WebElement from= driver.findElement(By.xpath("//a[text()=' SALES ']"));
       WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
      
//---now take action 
       act.clickAndHold(from).clickAndHold(to).release().build().perform();
	}

}
