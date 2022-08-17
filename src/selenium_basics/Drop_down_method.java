package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Velocity Technologies pvt ltd\\\\\\\\Automation Testing\\\\\\\\Selenium\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		// identify listbox to be handled and stored it in reference variable
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		// Create an object of Select class which will accept WebElement as argument
		
		Select s = new Select(listbox);
		
		// By using one of the select class methods we can select values from list box like 
		
		
		
		// selectByIndex: selectByIndex(int arg0) 
		// s.selectByIndex(2);
		
		// selectByVisibleText: selectByVisibleText(String arg0)
		//s.selectByVisibleText("Option2");
		
		// selectByValue: selectByValue(String arg0)
		s.selectByValue("option3");
		
		
		
		
		

	}

}
