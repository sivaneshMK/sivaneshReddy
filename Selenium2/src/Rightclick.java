import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			WebElement rightclick=driver.findElement(By.linkText("Gmail"));

			Actions a1= new Actions(driver);
			//to right click on the web element 
			a1.contextClick(rightclick).build().perform(); 
			a1.sendKeys(Keys.ARROW_DOWN).build().perform();
			a1.sendKeys(Keys.ENTER).build().perform();
	
	}

}
