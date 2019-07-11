package qspiders.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://beej.us/blog/data/drag-n-drop");
		WebElement goat3=	driver.findElement(By.id("goat3"));
		WebElement goat1= driver.findElement(By.id("goat1"));
		Actions a1= new Actions(driver);
		
		a1.clickAndHold(goat3).build().perform();
		a1.moveToElement(goat1).build().perform();
		a1.release(goat3).build().perform();
		
		
	}

}
