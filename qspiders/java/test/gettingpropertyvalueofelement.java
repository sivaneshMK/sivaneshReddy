package qspiders.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingpropertyvalueofelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
						
						WebDriver driver= new ChromeDriver();
						
						driver.get("https://www.seleniumhq.org");
						String s1= driver.findElement(By.linkText("")).getAttribute("class");
		
						System.out.println(s1);
		

	}

}
