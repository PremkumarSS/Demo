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

public class Demo28 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fil=new FileInputStream("./excel/CRW151.xlsx");
		Workbook book = WorkbookFactory.create(fil);
		Sheet sh = book.getSheet("Sheet1");
		Row ro = sh.getRow(0);	
		Cell cel = ro.getCell(0);
		String v = cel.getStringCellValue();
		System.out.println(v);
	}

}
