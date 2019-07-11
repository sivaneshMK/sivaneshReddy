package qspiders.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteADataInExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Login").getRow(0).createCell(4).setCellValue("computer");
		

	}

}
