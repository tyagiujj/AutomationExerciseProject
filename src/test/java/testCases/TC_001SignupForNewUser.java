package testCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.EnterAccoountInformation;
import pageObjects.NewUserSignUpPageObjects;
import pageObjects.SignUpLoginPage;
import testBase.BaseClass;

public class TC_001SignupForNewUser extends BaseClass {
	
    @Test(priority = 1,groups= {"Regression","Master"})
    public void ClickSignupLogin() {
        logger.info("***** Starting TC_001SignupForNewUser *****");
        SignUpLoginPage log = new SignUpLoginPage(driver);
        log.ClickonSignLoginButton();
        logger.info("Clicked on Sign/Login button");

        NewUserSignUpPageObjects user = new NewUserSignUpPageObjects(driver);
        logger.info("Entering name and email address for new user signup");
        Assert.assertTrue(user.isNewUserSignUpDisplayed(), "'New User Signup!' message is not displayed");

        user.enterFirstName("Ujjwal Tyagi");
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String uniqueEmail = "ujjwal" + timestamp + "@gmail.com";

        user.enterEmail(uniqueEmail);
        user.clickSignupButton();
    }

    @Test(priority = 2,groups= {"Regression","Master"})
    public void EnterAccountDetails() {
        EnterAccoountInformation infor = new EnterAccoountInformation(driver);
        logger.info("Entering the account information");
        
        Assert.assertTrue(infor.verifyEnterAccountInfoText(), "Enter Account information is not displayed");
        infor.clickTitle();
        infor.enterPassword("ujjwal@123");
        infor.selectDay("1");
        infor.selectMonth("January");
        infor.selectYear("2015");
        infor.clickOnNewsletterCheckbox();
        infor.clickOnSpecialOfferCheckbox();
        infor.enterFirstName("Ujjwal");
        infor.enterLastName("Tyagi");
        infor.enterCompany("Stuti Technologies pvt Ltd");
        infor.enterAddress1("Sarjapura");
        infor.enterState("Karnataka");
        infor.enterCity("Bangalore");
        infor.enterZipcode("562125");
        infor.enterMobileNumber("9756360213");
        infor.clickCreateAccount();
        
        Assert.assertTrue(infor.verifyAccountCreatedText(), "Account Created! is not displayed");
        infor.clickCoutinue();
        infor.ClickOnDeleteButton();
        Assert.assertTrue(infor.verifyAccountDeletedText(), "Account Deleted! text is not displayed");
        infor.ClickOnContinue1();
        
        logger.info("***** Finished TC_001SignupForNewUser *****");
    }
}
