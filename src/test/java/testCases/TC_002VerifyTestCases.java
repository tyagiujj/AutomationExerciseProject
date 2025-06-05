package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TestCasesPageObject;
import testBase.BaseClass;

public class TC_002VerifyTestCases extends BaseClass {
	
    @Test(priority = 1)
    public void VerifyTestCases() {
        TestCasesPageObject TC = new TestCasesPageObject(driver);

        logger.info("=== Starting TC_002VerifyTestCases ===");
        
        logger.info("Clicking on the 'Test Cases' button");
        TC.ClickOnTestCasesButton();
        
        logger.info("Verifying if the 'Test Cases' page text is displayed");
        Assert.assertTrue(TC.verifyTextCasesText(), "'Test Cases' page text is not displayed");
        
        logger.info("=== TC_002VerifyTestCases completed successfully ===");
    }

}
