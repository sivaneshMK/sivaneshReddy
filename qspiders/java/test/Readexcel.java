package qspiders.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {

	/*public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		Readexcel.Read(0,0);
		
		
	}*/
	
	public void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String s1= wb.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
	System.out.println(s1);
	
	
	}



	
}
