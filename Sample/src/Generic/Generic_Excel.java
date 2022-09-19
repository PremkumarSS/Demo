package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
	public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./excel/CRW151.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		String val=book.getSheet(sheet).getRow(row).getCell(row).getStringCellValue();
		return val;
		
		
	}

}
