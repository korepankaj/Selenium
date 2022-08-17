package hide_credential_with_POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Final_page {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//---Implicitly Wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://kite.zerodha.com/");
		
		File MyFile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Datadriven.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Pankaj");
		
		String userID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		
		
		LogIn_Page log = new LogIn_Page(driver);
	   
	    log.senduserid(userID);
	    log.sendpassword(Mysheet.getRow(0).getCell(1).getStringCellValue());
	    log.clickLoginbutton();
	    
	   //Thread.sleep(2000);
	    
	    Pin_page pin = new Pin_page(driver);
	    
	    pin.sendpin(Mysheet.getRow(0).getCell(2).getStringCellValue());
	    pin.clicksubmitbutton();
	    
	   // Thread.sleep(2000);
	    
	    Homepage home = new Homepage(driver);
	    home.clickuid();
	    home.clickLogout();
	    
	    driver.close();
		
	}

}
