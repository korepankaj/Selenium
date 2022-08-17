package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Simple1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Apache POI.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet 1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

}
