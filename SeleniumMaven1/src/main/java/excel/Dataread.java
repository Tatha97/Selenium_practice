package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Dataread {

	public static void read() throws IOException {
		
	FileInputStream fs=new FileInputStream("C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\Excel_Data\\DataSheet.xlsx");
	
	XSSFWorkbook workbook= new XSSFWorkbook(fs);
	
	XSSFSheet sheet=workbook.getSheetAt(0);

	
	Iterator<Row> rowIterator = sheet.iterator();

    // Traversing over each row of XLSX file
     while (rowIterator.hasNext())
     {
         Row row = rowIterator.next();

            if(row.getRowNum()!=0) // skip title row
            {
                Iterator  cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                 {

                    Cell cell = (Cell) cellIterator.next();

                    System.out.print(cell.getStringCellValue() + "\t");
                 }

             }
    }
	
	
	
	
	}
	
	public static void readcellvalue(String sheetName, String coloumnName) throws IOException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\Excel_Data\\DataSheet.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheet(sheetName);

		XSSFRow row= sheet.getRow(0);
		
		int col_num=0;
		
		for(int i=0; i < row.getLastCellNum(); i++)
        {
			//System.out.println(row.getCell(0).getStringCellValue());
            if(row.getCell(i).getStringCellValue().trim().equals(coloumnName))
                col_num = i;
        }
		
		for(int j=1;j<=sheet.getLastRowNum();j++) {
			
		 row = sheet.getRow(j);
        XSSFCell cell = (XSSFCell) row.getCell(col_num);
 
        String value = cell.getStringCellValue();
        System.out.println("Value of the Excel Cell is - "+ value);
		}
		
		/*int col_num=0;
		
		for(int i=0;i<row.getLastCellNum();i++) {
			
			if(row.getCell.getStringCellValue().trim().equals("Sanyal")) {
				col_num=i;
				break;
			}
			
		}
		for(int j=1;j<sheet.getLastRowNum();j++) {
			
		
		row=sheet.getRow(j);
		
		XSSFCell cell = (XSSFCell) row.getCell(col_num);
		
		System.out.println(cell.getStringCellValue()); 
		
		}*/
		
		
		
	}
		
}
	
	


