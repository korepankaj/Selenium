package apache_POI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_kind_data_read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile = new File("D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\Apache poi\\ForLoop.xlsx");

		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("datatypes");
		
//---Total number of rows
		int totalrow = Mysheet.getLastRowNum();
				
		System.out.println("Total number of rows are : "+totalrow);
				
//---Total number of column
		
		//short totalcol = Mysheet.getRow(0).getLastCellNum();
				
		int totalcells = Mysheet.getRow(0).getLastCellNum()-1;
				
		//System.out.println("Total number of column are : "+totalcol);
				
		System.out.println("Total number of columns : "+totalcells);
				
		System.out.println();
		
		for(int i=0;i<=totalrow;i++)
		{
			for(int j=0;j<=totalcells;j++)
			{
				Cell Mycell = Mysheet.getRow(i).getCell(j);
				
				CellType celldatatype = Mycell.getCellType();
				
				if(celldatatype==CellType.STRING)
				{
					String String = Mycell.getStringCellValue();
					System.out.print(String+" ");
					
				}
				else if(celldatatype==CellType.NUMERIC)
				{
					double number = Mycell.getNumericCellValue();
					System.out.print(number+" ");
				}
				else if(celldatatype==CellType.BOOLEAN)
				{
					boolean bool = Mycell.getBooleanCellValue();
					System.out.print(bool+" ");
				}
				else if(celldatatype==CellType.BLANK)
				{
					
				}
				
			}
			System.out.println();
			
		}

	}

}
