package testNG_POM_Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final_Page 
{
	WebDriver driver;
	File Myfile;
	Sheet Mysheet;
	LogIn_Page Log;
	Pin_page Pin;
	Homepage Home;
	
  @BeforeClass
  public void launchbrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver103.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  driver.get("https://kite.zerodha.com/");
	  
	  Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\TestNG_Combine.xlsx");
	  
	  Mysheet = WorkbookFactory.create(Myfile).getSheet("zerodha"); 
	  
	  Log = new LogIn_Page(driver);
	  Pin = new Pin_page(driver);
	  Home = new Homepage(driver);
	  
  }
  
  @BeforeMethod
  public void Loginzerodha()
  {
	  Log.senduserid(Mysheet.getRow(0).getCell(0).getStringCellValue());
	  Log.sendpassword(Mysheet.getRow(0).getCell(1).getStringCellValue());
	  Log.clickLoginbutton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Pin.sendpin(Mysheet.getRow(0).getCell(2).getStringCellValue());
	  Pin.clicksubmitbutton();
	  
  }
  
  @Test
  public void FinalPageValidation() 
  {
	  String expecteduserid = "BY2143";
	  String actualuserid = Home.Actualuid();
	  
	  Assert.assertEquals(actualuserid, expecteduserid,"actualuseid & expecteduserid is not matched please enter correct userid");
  }
  
  @AfterMethod
  public void Logoutzerodha() throws InterruptedException
  {
	 Thread.sleep(1000);
	 Home.clickLogout();
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
  
}
