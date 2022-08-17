package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_num_bool_string {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\Book1.xlsx");

		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
//---Reading numeric value		
		Cell value = mysheet.getRow(0).getCell(0);
		System.out.print(value.getCellType()+" ");
		System.out.println(value.getNumericCellValue()+" ");
		
		System.out.println();
		
//--Reading boolean value
		Cell Boolean = mysheet.getRow(0).getCell(1);
		System.out.print(Boolean.getCellType()+" ");
		System.out.println(Boolean.getBooleanCellValue()+" ");
		
		System.out.println();
		
//---Reading mail id
		Cell mailid = mysheet.getRow(0).getCell(2);
		System.out.print(mailid.getCellType()+" ");
		System.out.println(mailid.getStringCellValue());
		
		
		
	}

}
