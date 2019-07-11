package qspiders.java.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestClass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String browser ="Firefox";
		
		if(browser.equals("InternetExplorer")){
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Faculty\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		 driver= new InternetExplorerDriver();
		
		}
		
		else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Faculty\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
			 driver = new FirefoxDriver();
		}
			
			else if (browser.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}
			
		driver.get("https://www.google.com");
			
			
		}
		
		
		
		
	}


