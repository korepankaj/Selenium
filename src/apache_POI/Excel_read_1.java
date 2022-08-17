package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_read_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile1 = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Cricketer.xlsx");
	    
		String value1 = WorkbookFactory.create(myfile1).getSheet("India").getRow(0).getCell(0).getStringCellValue();
	    System.out.print(value1+" ");
	   
		
		String value2 = WorkbookFactory.create(myfile1).getSheet("India").getRow(0).getCell(1).getStringCellValue();
		System.out.print(value2+" ");
		
		String value3 = WorkbookFactory.create(myfile1).getSheet("India").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value3+" ");
		
		String value4 = WorkbookFactory.create(myfile1).getSheet("India").getRow(1).getCell(0).getStringCellValue();
		System.out.print(value4+" ");
		
		String value5 = WorkbookFactory.create(myfile1).getSheet("India").getRow(1).getCell(1).getStringCellValue();
		System.out.print(value5+" ");
		
		String value6 = WorkbookFactory.create(myfile1).getSheet("India").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value6);
	   
	    
	    

	}

}
