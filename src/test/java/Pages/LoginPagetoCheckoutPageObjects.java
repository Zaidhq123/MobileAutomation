package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPagetoCheckoutPageObjects {

    protected static MobileElement element = null;

    public static MobileElement Hamburger(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Koovs\"]"));
        return element;
    }

    public static MobileElement Loginlink(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/tv_log_in"));
        return element;
    }

    public static MobileElement Username(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_email"));
        return element;
    }

    public static MobileElement Password(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/et_password"));
        return element;
    }

    public static MobileElement LoginButton(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/btn_login"));
        return element;
    }

    public static MobileElement JeanBannner(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView"));

        return element;
    }

    public static MobileElement Brandsbutton(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/top_filter_1"));

        return element;
    }

    public static MobileElement Cancelicon(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/iv_close"));

        return element;
    }

    public static MobileElement Colourbutton(AppiumDriver<MobileElement> driver) {

        element = driver.findElement(By.id("com.koovs.fashion:id/top_filter_2"));

        return element;
    }

}
