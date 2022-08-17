package testNG_a_utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
   public static String readdatafromexcel(int rowno, int colno) throws EncryptedDocumentException, IOException
   {
	   File MyFile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\TestBaseUtility.xlsx");
	   
	   Reporter.log("Reading data from excel sheet",true);
	   
	   String value = WorkbookFactory.create(MyFile).getSheet("zerodha").getRow(rowno).getCell(colno).getStringCellValue();
	   
	   return value;
   }

   
   public static void capturescreenshot(WebDriver driver, String TestCaseID) throws IOException
   {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Screenshot\\TC"+TestCaseID+".png");
	  
	  FileHandler.copy(src, dest);
	  
	  Reporter.log("Take screenshot");
   }
}
