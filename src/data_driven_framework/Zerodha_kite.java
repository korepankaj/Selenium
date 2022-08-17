package data_driven_framework;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_kite {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Velocity Technologies pvt ltd\\\\Automation Testing\\\\Selenium\\\\chromedriver103.exe");
		
		File Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Datadriven.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Velocity");
		
		String UID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String Password = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys(UID);
        password.sendKeys(Password);
        Login.click();
        
        Thread.sleep(200);
        WebElement Pin = driver.findElement(By.id("pin"));
		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		
        Pin.sendKeys(PIN);
        Continue.click();
        
        Thread.sleep(2000);
        
        WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));
        
        String ExpectedResult = "ELR321";
        System.out.println("Expected Result is : "+ExpectedResult);
        String ActualResult = Uid.getText();
        System.out.println("Actual Result is : "+ActualResult);
        
        if(ExpectedResult.equals(ActualResult))
        {
        	System.out.println("Actual result and Expected result is matching");
        }
        else
        {
        	System.out.println("Actual result and Expected result is not matching");
        }
        
        Uid.click();
        
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        
     }
}
