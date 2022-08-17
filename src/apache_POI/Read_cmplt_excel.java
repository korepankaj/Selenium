package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_cmplt_excel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//---Read complete excel sheet		
		File Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\ForLoop.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Player");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" | ");
			}
			System.out.println();
		}
	}

}
