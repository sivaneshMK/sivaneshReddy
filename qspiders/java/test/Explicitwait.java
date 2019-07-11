package qspiders.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("amy");
		WebDriverWait w1 = new WebDriverWait(driver,60);
		w1.until(ExpectedConditions.presenceOfElementLocated
	(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div/span/b"))).click();

	}

}
