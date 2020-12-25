package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelData {

		public static XSSFWorkbook workbook;
		
		public static XSSFSheet worksheet;
		
		public static XSSFCell cell;
		
		
		public static String setexcelData(String path,String SheetName) throws IOException
		
		{
			//load the external file
			FileInputStream fis= new FileInputStream(path);
			
			// load the workbook 
			workbook =new XSSFWorkbook(fis);
			
		// read the worksheet
			worksheet=workbook.getSheet(SheetName);
			return SheetName;
			
		}
		
		public static String readcellData( int rowNum, int colNum)
		{
			cell=worksheet.getRow(rowNum).getCell(colNum);
			String cellData =cell.getStringCellValue();
			return cellData;
		}
		

}
