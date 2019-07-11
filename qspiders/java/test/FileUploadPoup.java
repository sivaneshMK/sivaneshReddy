package qspiders.java.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPoup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			     WebDriver driver= new ChromeDriver();
				
			     driver.get("https://www.monsterindia.com/");
			     driver.manage().window().maximize();
			     driver.findElement(By.xpath("//a[contains(@class,'btn block resume-btn btn-orange')]")).click();
			    Thread.sleep(3000);
			     driver.findElement(By.name("file")).click();
			     Robot r= new Robot();
			   //  D:\Doc1.docx
			     r.keyPress(KeyEvent.VK_D);
			     r.keyRelease(KeyEvent.VK_D);
			     r.keyPress(KeyEvent.VK_SHIFT);
			     r.keyPress(KeyEvent.VK_SEMICOLON);
			     r.keyRelease(KeyEvent.VK_SEMICOLON);
			     r.keyRelease(KeyEvent.VK_SHIFT);
			     r.keyPress(KeyEvent.VK_BACK_SLASH);
			     r.keyRelease(KeyEvent.VK_BACK_SLASH);
			     r.keyPress(KeyEvent.VK_SHIFT);
			     r.keyPress(KeyEvent.VK_D);
			     r.keyRelease(KeyEvent.VK_D);
			     r.keyRelease(KeyEvent.VK_SHIFT);
			     r.keyPress(KeyEvent.VK_O);
			     r.keyRelease(KeyEvent.VK_O);
			     r.keyPress(KeyEvent.VK_C);
			     r.keyRelease(KeyEvent.VK_C);
			     r.keyPress(KeyEvent.VK_1);
			     r.keyRelease(KeyEvent.VK_1);
			     r.keyPress(KeyEvent.VK_PERIOD);
			     r.keyRelease(KeyEvent.VK_PERIOD);
			     r.keyPress(KeyEvent.VK_D);
			     r.keyRelease(KeyEvent.VK_D);
			     r.keyPress(KeyEvent.VK_O);
			     r.keyRelease(KeyEvent.VK_O);
			     r.keyPress(KeyEvent.VK_C);
			     r.keyRelease(KeyEvent.VK_C);
			     r.keyPress(KeyEvent.VK_X);
			     r.keyRelease(KeyEvent.VK_X);
			     r.keyPress(KeyEvent.VK_ENTER);
			     r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	}

}
