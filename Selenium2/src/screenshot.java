import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
						
						WebDriver driver= new FirefoxDriver();
						
						driver.get("https://www.google.com");
						EventFiringWebDriver e1= new EventFiringWebDriver(driver);
						File f1= e1.getScreenshotAs(OutputType.FILE);
						File f2= new File("D:\\Selenium\\Screenshot.jpg");
						FileUtils.copyFile(f1, f2);
						

	}

}
