package TestClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileReader {
	public static String firstname;
	public static String lastname;
	public static  FileInputStream fis;
	public static Workbook wb;
	public static String Firstname() throws EncryptedDocumentException, IOException {
		fis= new FileInputStream("E:\\Book1234.xlsx");
		wb= new WorkbookFactory().create(fis);
		for(int i=0; i<=3; i++){
		String firstname= wb.getSheet("datafile").getRow(i).getCell(0).getStringCellValue();
		}
	return firstname;
	}
	public  static String LastName() throws FileNotFoundException{ 
		fis= new FileInputStream("E:\\Book1234.xlsx");
		
		for(int i=0; i<=3; i++){
			String lastname= wb.getSheet("datafile").getRow(i).getCell(1).getStringCellValue();
			}
		return lastname;
	}

}
