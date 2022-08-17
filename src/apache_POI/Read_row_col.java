package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_row_col 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\ForLoop.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Player");
		
//---Reading multiple data from single row
		
		for(int i=0; i<=2; i++)
		{
			String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		System.out.println("=======================");
		
//---Reading multiple data from single column	
		
		for(int i=0; i<=1; i++)
		{
			String value1 = Mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value1);
		}
	}

}
