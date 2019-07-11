package qspiders.java.test;

import java.awt.Event;


import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class ScreenShot {



	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		EventFiringWebDriver e1= new EventFiringWebDriver(driver);
		File f1= e1.getScreenshotAs(OutputType.FILE);
		File f2= new File("D:\\Selenium\\Screenshot.jpg");
		
		/*File f1 = e1.getScreenshotAs(OutputType.FILE);
		File f2= new File("D:\\Selenium\\screenshot.jpg");
	.copyFile(f1,f2);*/

	}

}
