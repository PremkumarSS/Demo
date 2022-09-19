package Selenum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo29 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fil=new FileInputStream("./excel/CRW151.xlsx");
		Workbook book = WorkbookFactory.create(fil);
		Sheet sh = book.getSheet("Sheet1");
		for(int i=0;i<=sh.getLastRowNum();i++)

	{
			Row ro = sh.getRow(i);
			Cell cel = ro.getCell(0);
			String v = cel.getStringCellValue();
			System.out.println(v);
			}
	}

}
