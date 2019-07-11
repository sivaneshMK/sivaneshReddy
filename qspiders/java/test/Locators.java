package qspiders.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//To start browser
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		for(int i=1; i<=9; i++){
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.id("email")).sendKeys(Locators.read(i,1));
		driver.findElement(By.id("pass")).sendKeys(Locators.password(i, 2));

		driver.findElement(By.id("u_0_a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		}
}
	
	public static String read(int r, int j) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String s1= wb.getSheet("Login").getRow(r).getCell(j).getStringCellValue();
		return s1;
	
	}
	
public static String password(int e, int f) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String s2= wb.getSheet("Login").getRow(e).getCell(f).getStringCellValue();
		return s2;
	
	}
	
	
}
