package pop_up;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ChildBrowser_pop_up {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://skpatro.github.io/demo/links/");

        driver.findElement(By.name("NewWindow")).click();
        
        Thread.sleep(2000);
        
//---To get single id (main page)        
        String idofmainpage = driver.getWindowHandle();
        System.out.println(idofmainpage);
        
//---To get multiple window id 
        Set<String> idofallpage = driver.getWindowHandles();
         System.out.println(idofallpage);
         
//---Convert set into ArrayList
         ArrayList <String> al = new ArrayList<>(idofallpage);
         String newidofmainpage = al.get(0);    //address of main window 
         String idofchildpage = al.get(1);      //address of child window
         
//---switch focus from main page to child page
         driver.switchTo().window(idofchildpage);  //selenium focus changed from main page to child page
         
         driver.manage().window().maximize();
         
         driver.findElement(By.id("the7-search")).sendKeys("Pankaj");
         
//---TakeScreenShot         
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String random = RandomString.make(2);
        File dest = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\childbrowser"+random+".jpg");
        FileHandler.copy(src, dest);
        
        driver.close();
     // driver.quit();
        
//--To work on main page, switch selenium focus from child page to main page
        driver.switchTo().window(newidofmainpage);
        
       
        
        String mytext = driver.findElement(By.xpath("//p[contains(text(),'link in new tab')]")).getText();
        System.out.println(mytext);
        
        
        
        
        
	}

}
