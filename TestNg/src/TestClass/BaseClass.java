package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@BeforeMethod
	public void StartBrowser(){
			  System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Selenium\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			 driver.get("https://www.facebook.com");
		
	}
  @Test(dataProvider="testData")
  public void StartFacebook(String s1,String s2) {
	driver.findElement(By.name("firstname")).sendKeys(s1);
	driver.findElement(By.name("lastname")).sendKeys(s2);
  }
 @Test(dataProvider="testData",dependsOnMethods="StartFacebook")
	public void enterdetails(String s3, String s4){
		driver.findElement(By.name("reg_email__")).sendKeys(s3);
		driver.findElement(By.name("reg_passwd__")).sendKeys(s4);
	}
 
	@DataProvider
	public Object[][] testData(){
		
		Object[][] data= new Object[2][2];
		data[0][0]="test1";
		data[0][1]="test2";
		data[1][0]="test3";
		data[1][1]="test4";
		return data;
	}
	 @AfterMethod
	 public void closebrowser(){
		 driver.quit();
	 }
	
	 
	
  
}
