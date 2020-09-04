package Testcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    
    AppiumDriver<MobileElement> driver;
    public Properties prop;
    @BeforeTest
    public void setup() throws IOException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("platformName", "ANDROID");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("deviceName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("AppPackage", "com.koovs.fashion");
        cap.setCapability("AppActivity", "com.koovs.fashion.activity.SplashScreen");
        // cap.setCapability("APP","C:\\Users\\zaidh\\AppiumTest\\src\\main\\resources\\apk\\app-debugkoovs.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Koovs\"]")).click();

        prop= new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\zaidh\\AppiumTest\\src\\test\\java\\utils\\config.properties");
        prop.load(fis);



    }


    public void getScreenshot(String result) throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\zaidh\\AppiumTest\\src\\test\\java\\Resources"+result+"screenshot.png"));

    }
}


