package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderedlist {

	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.google.co.in/");
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Honda");
	   
	   Thread.sleep(2000);
	   
	   List<WebElement> unordered = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

	   System.out.println(unordered.size());
	   
	   System.out.println();
	   
	   for( WebElement pankaj : unordered)
	   {
		   System.out.println(pankaj.getText());
	   }
	   
	   Thread.sleep(2000);
	   
	   for(  WebElement pankaj : unordered)
	   {
		   String expectedResult = "honda amaze";
		   		
		   String actualText = pankaj.getText();
		   
		   
		  if(actualText.equals(expectedResult))
		   {
			   pankaj.click();
			   break;
		   }
	   }
	   
	   driver.findElement(By.linkText("Images")).click();
	}

}
