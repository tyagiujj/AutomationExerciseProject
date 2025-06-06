package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.InvalidLoginPage;
import pageObjects.SignUpLoginPage;
import testBase.BaseClass;

public class TC_003LoginWithInvalidEmailAndPassword extends BaseClass {

    @Test(priority = 1,groups={"Sanity","Master"})
    public void ClickOnSignup() {
        logger.info("**** TC_003: ClickOnSignup Test Started ****");
        SignUpLoginPage Sign = new SignUpLoginPage(driver);
        logger.info("Clicking on Signup/Login button");
        Sign.ClickonSignLoginButton();
    }
    @Test(priority = 2)
    public void VerifLoginFunctionality() {
        logger.info("**** TC_003: VerifLoginFunctionality Test Started ****");
        InvalidLoginPage login = new InvalidLoginPage(driver);
        
        logger.info("Verifying 'Login to your account' text");
        Assert.assertTrue(login.verifyLoginAccoutText(), "Login to your account is not Display");
        
        logger.info("Entering invalid email");
        login.EnterTheInvalidEmail("ujjwal123@gmail.com");
        
        logger.info("Entering invalid password");
        login.EnterTheInvalidPassword("ujjwal@344");
        
        logger.info("Clicking on Login button");
        login.ClickOnLogin();
        
        logger.info("Verifying error message for incorrect login");
        Assert.assertTrue(login.VerifyTheErroMessage(), "Your email or password is incorrect! Error Message is not Display");
    }
}
