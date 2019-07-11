import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://beej.us/blog/data/drag-n-drop/");
			WebElement goat3=driver.findElement(By.id("goat3"));
			WebElement tg= driver.findElement(By.id("dropzone0"));
			Actions draganddrop= new Actions(driver);
			//draganddrop.dragAndDrop(goat3, tg).build().perform();
			draganddrop.dragAndDropBy(goat3, 100, -100).build().perform(); 
			Thread.sleep(3000);
			draganddrop.dragAndDropBy(goat3, -100, -100).build().perform();
			Thread.sleep(3000);
			draganddrop.dragAndDropBy(goat3, -100, 100).build().perform();
			Thread.sleep(3000);
			draganddrop.dragAndDropBy(goat3, 100, 100).build().perform();
			Thread.sleep(3000);

	
	
	}

}
