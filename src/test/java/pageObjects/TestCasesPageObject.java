package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPageObject extends BasePage {

	public TestCasesPageObject(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[normalize-space()='Test Cases']")
 WebElement  TestCasesButton;

	@FindBy(xpath="//b[normalize-space()='Test Cases']")
	WebElement TestCasesText;
	
	public void ClickOnTestCasesButton() {
		TestCasesButton.click();
	}

    public boolean verifyTextCasesText() {
        return TestCasesText.getText().equalsIgnoreCase("Test Cases");
    }
	
}
