package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Velocity Technologies pvt ltd\\\\Automation Testing\\\\Selenium\\\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		
		drive.get("https://www.yatra.com/");
		
		WebElement checkbox = drive.findElement(By.id("special_student_offer"));
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			System.out.println("Please select checkbox");
			checkbox.click();
			System.out.println("Checkbox selected successfully");
		}
	}

}
