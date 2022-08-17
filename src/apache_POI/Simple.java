package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Simple{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile2 = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Velocity.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile2);
		
		Sheet mysheet = myworkbook.getSheet("Pune");
		
		String value = mysheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);

	}

}
