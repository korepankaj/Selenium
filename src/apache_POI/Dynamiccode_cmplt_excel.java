package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamiccode_cmplt_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\ForLoop.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("myself");
		
//---Total number of rows
		int totalrow = Mysheet.getLastRowNum();
		
		System.out.println("Total number of rows are : "+totalrow);
		
//---Total number of column
		//short totalcol = Mysheet.getRow(0).getLastCellNum();
		
		int totalcells = Mysheet.getRow(0).getLastCellNum()-1;
		
		//System.out.println("Total number of column are : "+totalcol);
		
		System.out.println("Total number of columns : "+totalcells);
		
		System.out.println();
		
//---Dynamic code read excel sheet
		for(int i=0;i<=totalrow;i++)
		{
			//for(int j=0;j<=totalcol;j++)
			for(int j=0;j<=totalcells;j++)
			{
				String dynamic = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(dynamic+" ");
			}
			System.out.println();
		}
		
	}

}
