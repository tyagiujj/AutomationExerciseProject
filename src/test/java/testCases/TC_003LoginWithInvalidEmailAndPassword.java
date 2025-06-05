package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.InvalidLoginPage;
import pageObjects.SignUpLoginPage;
import testBase.BaseClass;

public class TC_003LoginWithInvalidEmailAndPassword extends BaseClass {
	@Test(priority=1)
	public void ClickOnSignup() {
		SignUpLoginPage Sign= new SignUpLoginPage(driver);
		Sign.ClickonSignLoginButton();
	}
	@Test(priority=2)
	public void VerifLoginFunctionality() {
		InvalidLoginPage login= new InvalidLoginPage(driver);
		Assert.assertTrue(login.verifyLoginAccoutText(),"Login to your account is not Display");
		login.EnterTheInvalidEmail("ujjwal123@gmail.com");
		login.EnterTheInvalidPassword("ujjwal@344");
		login.ClickOnLogin();
		Assert.assertTrue(login.VerifyTheErroMessage(),"Your email or password is incorrect! Error Message is not Display");
		
	}
	

}
