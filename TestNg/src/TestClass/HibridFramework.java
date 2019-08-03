package TestClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bsh.This;

public class HibridFramework {
	WebDriver driver;
	Hibrid hi;

	@BeforeMethod
	public void StartBrowser(){
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Selenium\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			 driver.get("https://www.facebook.com");
		
	}
  @Test
  public void StartFacebook() throws InterruptedException {
	hi= PageFactory.initElements(driver, Hibrid.class);
	hi.getF_name().sendKeys("sivanesh");
	Thread.sleep(3000);
	
	hi.getL_name().sendKeys("siva");
	Thread.sleep(3000);
  }
	 @AfterMethod
	 public void closebrowser(){
		 driver.quit();
	 }
	
  

}

	


