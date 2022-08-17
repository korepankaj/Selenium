package action_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
//---create object of actions class and pass driver object  as parameter 
       Actions act = new Actions(driver);
       
//---find the element to be worked and stored in reference variable       
       WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));

//---Take the required action       
       act.doubleClick(doubleclick).perform();
       
       
//---Alert pop up
       Alert ok = driver.switchTo().alert();
       System.out.println(ok.getText());
       ok.accept();
       
       
       
	}

}
