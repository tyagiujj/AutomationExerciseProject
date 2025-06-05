package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactToUsPage extends BasePage {

    public ContactToUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement ClickContactUs;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement Getintouch;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement Name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement Subject;

    @FindBy(xpath = "//textarea[@id='message']")
    WebElement Message;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement Submit;
    
    @FindBy(xpath="//div[@class='status alert alert-success']")
    WebElement SuccessMessage;
    
    @FindBy(xpath="//span[normalize-space()='Home']")
    WebElement HomeButton;

    public void ClickonContactUs() {
        ClickContactUs.click();
    }

    public boolean GetInTouchExists() {
        try {
            return (Getintouch.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }

    public void EnterTheName(String name) {
        Name.sendKeys(name);
    }

    public void EnterTheEmailId(String email) {
        Email.sendKeys(email);
    }

    public void EnterTheSubject(String subject) {
        Subject.sendKeys(subject);
    }

    public void EnterTheMessage(String message) {
        Message.sendKeys(message);
    }

    public void ClickOnSubmitButton() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Submit);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Submit);
        } catch (Exception e) {
            System.out.println("JavaScript click failed: " + e.getMessage());
            try {
                Thread.sleep(1000);
                Submit.click();
            } catch (Exception ex) {
                System.out.println("Fallback normal click failed: " + ex.getMessage());
            }
        }
    }
    public boolean SuccessMessageExists() {
        try {
            return (SuccessMessage.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }
    public void ClickonHomeButton() {
    	HomeButton.click();
    }
}

