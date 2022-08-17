package open_link_new_tab;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_link_new_tab {

	public static void main(String[] args) throws InterruptedException 
	{
	  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Chrome driver\\chromedriver.exe");
	  	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.findElement(By.name("q")).sendKeys("London time"+Keys.ENTER);
	    
	    WebElement London = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]"));
	    
	    Actions act = new Actions(driver);
	    
        act.keyDown(Keys.CONTROL).moveToElement(London).click().perform();
        
//---Get multiple tab id        
        Set<String> idofallpage = driver.getWindowHandles();
        System.out.println(idofallpage);
        
//---Convert set into ArrayList
        ArrayList <String> al = new ArrayList<>(idofallpage);
        String newidofmaintab = al.get(0);    //address of main window 
        String idofchildtab = al.get(1);      //address of child window
        
//---Switch focus from main tab to second tab
        
        driver.switchTo().window(idofchildtab);
	}

}
