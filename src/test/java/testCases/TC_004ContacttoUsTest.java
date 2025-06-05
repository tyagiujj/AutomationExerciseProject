package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ContactToUsPage;
import testBase.BaseClass;

public class TC_004ContacttoUsTest extends BaseClass {

    @Test(priority = 1)
    public void ContactToUs() {
        try {
            logger.info("***TC_004 ContactoUsTest Started***");
            ContactToUsPage Contact = new ContactToUsPage(driver);
            Contact.ClickonContactUs();
            logger.info("***Click on Contact to Us Button***");

            boolean Touch = Contact.GetInTouchExists();
            logger.info("***Verify 'GET IN TOUCH' is visible***");
            Assert.assertEquals(Touch, true, "Get In Touch is not Dispaly");

            Contact.EnterTheName("ujjwaltyagi");
            logger.info("***Enter The Contact Name***");

            Contact.EnterTheEmailId("ujjwaltyagi" + System.currentTimeMillis() + "@gmail.com");
            logger.info("***Enter The Email Address***");

            Contact.EnterTheSubject("Testing");
            logger.info("***Enter The Subject***");

            Contact.EnterTheMessage("QA");
            logger.info("***Enter The Message***");

            Contact.ClickOnSubmitButton();
            logger.info("***Click on Submit Button***");

            try {
                Thread.sleep(1000);
                driver.switchTo().alert().accept();
                logger.info("***Alert accepted successfully***");
            } catch (Exception e) {
                logger.warn("***No alert appeared or alert handling failed: " + e.getMessage() + "***");
            }
            boolean Sucess= Contact.SuccessMessageExists();
            logger.info("***Verify Success! Your details have been submitted successfully.***");
            Assert.assertEquals(Sucess,true ,"Success! Your details have been submitted successfully.is not Display");
            Contact.ClickonHomeButton();
            logger.info("***Click On Home Button***");

        } catch (Exception e) {
            Assert.fail();
        }
    }
}
