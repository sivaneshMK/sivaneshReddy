import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class FileDownloadpopup {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/zip");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir","D:\\Selenium");
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("32 bit Windows IE")).click();
		
		
	}

}
