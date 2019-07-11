import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousemove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://beej.us/blog/data/drag-n-drop/");
			WebElement goat3=driver.findElement(By.id("goat3"));
			WebElement tg= driver.findElement(By.id("dropzone0"));
			Actions mouse= new Actions(driver);
			mouse.clickAndHold(goat3).moveToElement(tg).build().perform();
			
			Thread.sleep(3000);

	}

}
