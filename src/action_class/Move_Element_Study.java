package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Element_Study {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//---To take mouse actions, need to create object of actions class and pass driver object  as parameter
		
        Actions act = new Actions(driver);
        
//---Find element to be act
        
        WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
        
//--now take actions
        
        act.moveToElement(aboutus).perform();
          
//--click method using action class
        
       // act.click().perform();
        
//---I want to click on radio button
        
        WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
        
//        act.moveToElement(radio1).perform();
//        act.click().perform();
        
        act.moveToElement(radio1).click().build().perform();
        
//        act.click(radio1).perform();
	}
	

}
