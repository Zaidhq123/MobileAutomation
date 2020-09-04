package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;

public class SignUpFlowPageObjects {

    protected static MobileElement element = null;

    public static MobileElement SignUpLink(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/tv_sign_up"));
        return element;
    }

    public static MobileElement name(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_name"));
        return element;
    }

    public static MobileElement newEmail(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_email"));
        return element;
    }

    public static MobileElement newPassword(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_password"));
        return element;
    }


    public static MobileElement Phone(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_mobile"));
        return element;
    }

    public static MobileElement Gender(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/tv_male"));
        return element;
    }

    public static MobileElement SignUp(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/btn_sign_up"));
        return element;
    }
}
