package TestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hibrid {
	@FindBy(name="firstname")
	private WebElement f_name;
	
	public WebElement getF_name() {
		return f_name;
	}
	
	
	
	@FindBy(name="lastname")
	private WebElement l_name;
	
	public WebElement getL_name() {
		return l_name;
	}
}
