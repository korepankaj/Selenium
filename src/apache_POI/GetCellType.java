package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File cell = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\CellInfo.xlsx");

		Workbook myworkbook = WorkbookFactory.create(cell);
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType cellinfo = mycell.getCellType();
		System.out.print(cellinfo+" ");
		
		Cell mycell1 = myrow.getCell(1);
		CellType cellinfo1 = mycell1.getCellType();
		System.out.print(cellinfo1+" ");
		
		Cell mycell2 = myrow.getCell(2);
		CellType cellinfo2 = mycell2.getCellType();
		System.out.println(cellinfo2);
		
	}

}

