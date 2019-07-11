package qspiders.java.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebNotificationPopup {

	public static void main(String[] args) {
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Faculty\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(option);
	driver.get("https://www.yatra.com/");
		
		
	}

}
