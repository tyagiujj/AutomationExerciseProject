package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterAccoountInformation extends BasePage {
   
	public EnterAccoountInformation(WebDriver driver) {
    	 super(driver);
    }
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement EnterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement Title;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement Day;

    @FindBy(xpath = "//select[@id='months']")
    WebElement Month;

    @FindBy(xpath = "//select[@id='years']")
    WebElement Year;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement Newsletter;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement ReceiveSpecialOffer;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement LastName;

    @FindBy(xpath = "//input[@id='company']")
    WebElement Company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement Address1;

    @FindBy(xpath = "//input[@id='state']")
    WebElement State;

    @FindBy(xpath = "//input[@id='city']")
    WebElement City;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement Zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement MobileNumber;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement CreateAccountBtn;
    
    @FindBy(xpath="//b[normalize-space()='Account Created!']")
    WebElement AccountCreatedText;
    
    @FindBy(xpath="//a[normalize-space()='Continue']")
    WebElement Contiune;
    
    @FindBy(xpath="//a[normalize-space()='Delete Account']")
    WebElement DeleteAccount;
    
    @FindBy(xpath="//b[normalize-space()='Account Deleted!']")
    WebElement AccountDeletedText;
    
    @FindBy(xpath="//a[normalize-space()='Continue']")
    WebElement Continue1;
    

    public boolean verifyEnterAccountInfoText() {
        return EnterAccountInformationText.getText().equalsIgnoreCase("ENTER ACCOUNT INFORMATION");
    }
    public void clickTitle() {
        Title.click();
    }
    public void enterPassword(String pass) {
        Password.sendKeys(pass);
    }
    public void selectDay(String day) {
        Day.sendKeys(day);
    }

    public void selectMonth(String month) {
        Month.sendKeys(month);
    }

    public void selectYear(String year) {
        Year.sendKeys(year);
    }

    public void clickOnNewsletterCheckbox() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Newsletter);
            
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Newsletter);
        } catch (Exception e) {
            System.out.println("JavaScript click failed: " + e.getMessage());
            try {
                Thread.sleep(1000);
                Newsletter.click();
            } catch (Exception ex) {
                System.out.println("Fallback normal click failed: " + ex.getMessage());
            }}}
    public void clickOnSpecialOfferCheckbox() {
        ReceiveSpecialOffer.click();
    }
    public void enterFirstName(String fname) {
        FirstName.sendKeys(fname);
    }
    public void enterLastName(String lname) {
        LastName.sendKeys(lname);
    }
    public void enterCompany(String comp) {
        Company.sendKeys(comp);
    }
    public void enterAddress1(String addr1) {
        Address1.sendKeys(addr1);
    }

    public void enterState(String state) {
        State.sendKeys(state);
    }
    public void enterCity(String city) {
        City.sendKeys(city);
    }
    public void enterZipcode(String zip) {
        Zipcode.sendKeys(zip);
    }
    public void enterMobileNumber(String mobile) {
        MobileNumber.sendKeys(mobile);
    }
    public void clickCreateAccount() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccountBtn);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CreateAccountBtn);
        } catch (Exception e) {
            System.out.println("JavaScript click failed: " + e.getMessage());
            try {
                Thread.sleep(1000);
                CreateAccountBtn.click();
            } catch (Exception ex) {
                System.out.println("Fallback normal click failed: " + ex.getMessage());
            }}
        }
    public boolean verifyAccountCreatedText() {
        return AccountCreatedText.getText().equalsIgnoreCase("Account Created!");
    }
    public void clickCoutinue() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Contiune);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Contiune);
        } catch (Exception e) {
            System.out.println("JavaScript click failed: " + e.getMessage());
            try {
                Thread.sleep(1000);
                Contiune.click();
            } catch (Exception ex) {
                System.out.println("Fallback normal click failed: " + ex.getMessage());
            }}
        }
    public void ClickOnDeleteButton() {
    	DeleteAccount.click();
    }

    public boolean verifyAccountDeletedText() {
        return AccountDeletedText.getText().equalsIgnoreCase("Account Deleted!");
    }
    public void ClickOnContinue1() {
    	Continue1.click();
    }
    }
