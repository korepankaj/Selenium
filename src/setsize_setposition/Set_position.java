package setsize_setposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
//---Create object of point class and pass x and y values
		Point p = new Point(100,70);
		
//---Call setposition method and pass object of point class
	    driver.manage().window().setPosition(p);
		

	}

}
