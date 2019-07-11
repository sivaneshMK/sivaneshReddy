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
			driver.get("https://www.monsterindia.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.className("main-nav-link")).click();
			
			WebElement e1= driver.findElement(By.xpath("//span[text()='Industry']"));
			Thread.sleep(3000);
			Select s1 = new Select(e1);
			
			s1.selectByIndex(0);
			s1.selectByIndex(2);
	
	
	
	
	
	
	
	
	
	
	}

}
