import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://portal.intelschool.in/");
			driver.findElement(By.name("username")).sendKeys("premex");
			driver.findElement(By.name("pass")).sendKeys("premex1");
			driver.findElement(By.id("user-login")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Dimension d= new Dimension(300, 300);
			driver.manage().window().setSize(d);
			driver.findElement(By.id("profile-settings")).click();
			WebElement e1= driver.findElement(By.name("empFirstName"));
			e1.clear();
			Thread.sleep(3000);
			e1.sendKeys("sivanesh");
	}
}