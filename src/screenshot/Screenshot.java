package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Velocity Technologies pvt ltd\\\\Automation Testing\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://pmc.gov.in/mr");
	    
	    Thread.sleep(2000);
	    
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File dest = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\punecorporationltd.png");
        
        org.openqa.selenium.io.FileHandler.copy(src, dest);
		
        
	}

}
