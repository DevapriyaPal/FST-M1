package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","SamsungM51");
        dcap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        dcap.setCapability("appActivity",".Calculator");

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer,dcap);

    }

    @Test
    public void multiplication(){
        driver.findElementById("calc_keypad_btn_07").click();
        driver.findElementById("calc_keypad_btn_mul").click();
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_equal").click();

        String result = driver.findElementById("calc_edt_formula").getText();
        Assert.assertEquals(result,"35");

    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}