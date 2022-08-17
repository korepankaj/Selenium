package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalPage_Zerodha {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/#loggedout");
		
		LogInPage_Zerodha Login = new LogInPage_Zerodha(driver);
		
		Login.sendUserId();
		Login.sendpassword();
		Login.clickLogin();
		
		Thread.sleep(2000);
		
		Pinpage_zerodha Pin = new Pinpage_zerodha(driver);
		
		Pin.sendpin();
		Pin.clickcontinue();
		
		Homepage_zerodha Home = new Homepage_zerodha(driver);
		
		Thread.sleep(2000);
		
		Home.clickUserid();
		Home.clickLogOut();

	}

}
