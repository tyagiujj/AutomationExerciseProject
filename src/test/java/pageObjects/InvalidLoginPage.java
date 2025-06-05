package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidLoginPage extends BasePage {

	public InvalidLoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement Logintoyouraccounttext;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement LoginEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement LoginPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginButton;
	
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	WebElement ErrorMessage;
	
	 public boolean verifyLoginAccoutText() {
	        return Logintoyouraccounttext.getText().equalsIgnoreCase("Login to your account");
	    }
	 public void EnterTheInvalidEmail(String email) {
		 LoginEmail.sendKeys(email);}
	 
	 public void EnterTheInvalidPassword(String password) {
	 LoginPassword.sendKeys(password);}
	 
	 public void ClickOnLogin() {
		 LoginButton.click();
	 }
	 
	 public boolean VerifyTheErroMessage() {
		 return ErrorMessage.getText().equalsIgnoreCase("Your email or password is incorrect!");
	 }}

