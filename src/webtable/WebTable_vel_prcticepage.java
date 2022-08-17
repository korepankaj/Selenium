package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_vel_prcticepage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		String url = "https://vctcpune.com/selenium/practice.html";
		driver.get(url);
		
//---How to find no. of rows		
	    List<WebElement> noofrow = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println("No of rows in table are:  "+noofrow.size());
		
//---How to find no. of column
		List<WebElement> noofcolumn = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		
		System.out.println("No. of column in table are:  "+noofcolumn.size());
		
//---To print header in table
		for( WebElement headername : noofcolumn)
		{
			System.out.print(headername.getText()+" || ");
		}
		
		System.out.println();
		
//---To print rows in a table
		
		for( WebElement rowname : noofrow)
		{
			System.out.print(rowname.getText()+" || ");
			
			System.out.println();
		}
		
	}
	
  }
