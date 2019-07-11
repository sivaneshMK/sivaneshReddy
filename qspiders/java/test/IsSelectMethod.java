package qspiders.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement check=driver.findElement(By.xpath("//*[@id='u_0_8']"));
		boolean variable=check.isSelected();
		System.out.println(variable);
		check.click();
		boolean variable1 = check.isSelected();
		
		System.out.println(variable1);
	
	
	
	}

}
