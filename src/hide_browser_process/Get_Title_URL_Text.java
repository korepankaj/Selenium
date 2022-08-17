package hide_browser_process;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Title_URL_Text {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");

//---Headless browser
		 
//		 ChromeOptions option = new ChromeOptions();
//		 option.addArguments("--headless");
		 
		 WebDriver driver = new ChromeDriver();
		   
		 driver.manage().window().maximize();
		   
		 //driver.get("https://www.mphasis.com/home.html");
		   
		 driver.get("https://pmc.gov.in/mr"); 
		  
		 //driver.get("https://latur.gov.in/en/latur-district-municipal-corporation/");
		  
         System.out.println(driver.getTitle());
		  
		 System.out.println(driver.getCurrentUrl());
		  
		 //System.out.println(driver.findElement(By.xpath("//h1[text()='पुणे महानगरपालिका']")).getText());
		   
		 WebElement pune = driver.findElement(By.xpath("//h1[text()='पुणे महानगरपालिका']"));
         System.out.println(pune.getText());
	 }
}