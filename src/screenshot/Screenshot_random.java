package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_random {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\Velocity Technologies pvt ltd\\\\\\\\\\\\\\\\Automation Testing\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.kpit.com/");
	    
	    File from = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	    String random = RandomString.make(2);
	  
	   // System.out.println(random);
	    
	    File to = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\KPIT"+random+".jpg");
	  
       FileHandler.copy(from, to);
	}

}
