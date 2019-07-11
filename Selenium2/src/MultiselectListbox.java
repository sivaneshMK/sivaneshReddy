import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiselectListbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
		
	     driver.get("http://mukesh-pc/login.do");
	     driver.findElement(By.name("username")).sendKeys("admin");
	     
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	     
	     driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	     driver.findElement(By.linkText("Reports")).click();
	     
	     WebElement users=driver.findElement(By.name("users"));
	     
	     Select s1= new Select(users);
	     
	     s1.selectByIndex(0);
	     Thread.sleep(3000);
	     s1.selectByValue("3");
	     Thread.sleep(3000);
	     s1.selectByVisibleText("kumar, suresh (admin4)");
	     Thread.sleep(3000);
	     s1.deselectAll();
	     Thread.sleep(3000);
	     s1.selectByIndex(0);
	     Thread.sleep(3000);
	     s1.selectByValue("3");
	     Thread.sleep(3000);
	     s1.selectByVisibleText("kumar, suresh (admin4)");
	     Thread.sleep(3000);
	     s1.deselectByIndex(1);
	     Thread.sleep(3000);
	     s1.deselectByValue("4");
	     Thread.sleep(3000);
	     s1.deselectByVisibleText("kumar, suresh (admin4)");
	
	
	
	
	
	
	
	}

}
