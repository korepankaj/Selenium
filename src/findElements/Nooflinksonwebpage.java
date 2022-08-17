package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nooflinksonwebpage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		driver.get("https://vctcpune.com/");
		
//--- Create object of findelements. return type of findElements is List<WebElements> take reference variable of List<WebElement>. 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("How many links");
		
		System.out.println(links.size());
		
		System.out.println();
		
		System.out.println("what are the links");
		
		for(WebElement l : links)
		{
			System.out.println(l.getText());
		}
		
		
		
	}

}
