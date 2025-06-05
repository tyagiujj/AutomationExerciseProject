package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLoginPage extends BasePage {

	public SignUpLoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement signup;
	
	public void ClickonSignLoginButton() {
		signup.click();
	}
}
