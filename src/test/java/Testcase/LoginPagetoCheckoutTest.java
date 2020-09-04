package Testcase;

import org.testng.annotations.Test;
import Pages.LoginPagetoCheckoutPageObjects;


public class LoginPagetoCheckoutTest extends BaseClass {


    @Test(priority = 1)
    public void LoginPage() {

        // click on login button
        LoginPagetoCheckoutPageObjects.Hamburger(driver).click();
        LoginPagetoCheckoutPageObjects.Loginlink(driver).click();
        LoginPagetoCheckoutPageObjects.Username(driver).sendKeys(prop.getProperty("email"));
        LoginPagetoCheckoutPageObjects.Password(driver).sendKeys(prop.getProperty("password"));
        LoginPagetoCheckoutPageObjects.LoginButton(driver).click();
        LoginPagetoCheckoutPageObjects.JeanBannner(driver).click();
        LoginPagetoCheckoutPageObjects.Brandsbutton(driver).click();
        LoginPagetoCheckoutPageObjects.Cancelicon(driver).click();
        LoginPagetoCheckoutPageObjects.Colourbutton(driver).click();
        LoginPagetoCheckoutPageObjects.Cancelicon(driver).click();
    }


}
