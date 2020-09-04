package Testcase;

import Pages.LoginPagetoCheckoutPageObjects;
import Pages.SignUpFlowPageObjects;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Signupflow extends BaseClass {

    @Test (priority = 2)
    public void signup() {

        LoginPagetoCheckoutPageObjects.Hamburger(driver).click();
        SignUpFlowPageObjects.SignUpLink(driver).click();
        SignUpFlowPageObjects.name(driver).sendKeys(prop.getProperty("username"));
        SignUpFlowPageObjects.newEmail(driver).sendKeys(prop.getProperty("newemail"));
        SignUpFlowPageObjects.newPassword(driver).sendKeys(prop.getProperty("newpassword"));
        SignUpFlowPageObjects.Phone(driver).sendKeys(prop.getProperty("phone"));
        SignUpFlowPageObjects.Gender(driver).click();
        SignUpFlowPageObjects.SignUp(driver).click();
        LoginPagetoCheckoutPageObjects.Hamburger(driver).click();


    }


}
