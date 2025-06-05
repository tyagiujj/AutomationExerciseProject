package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserSignUpPageObjects extends BasePage {

    public NewUserSignUpPageObjects(WebDriver driver) {
        super(driver);
}
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
   public WebElement msgDisplay;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement Name;
    
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement Signupmail;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement SignupButton;
  
    public boolean isNewUserSignUpDisplayed() {
        try {
            return msgDisplay.isDisplayed();
        } catch (Exception e) {
            return false;
        }}
    public void enterFirstName(String name) {
        Name.sendKeys(name);
    }

    public void enterEmail(String mail) {
        Signupmail.sendKeys(mail);
    }

    public void clickSignupButton() {
        SignupButton.click();
    }
}
