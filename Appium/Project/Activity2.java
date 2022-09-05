package LiveProject;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity2 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","Alamgir's M51");
        dcap.setCapability("appPackage", "com.google.android.keep");
        dcap.setCapability("appActivity",".activities.BrowseActivity");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void googleKeep() {
        driver.findElementById("new_note_button").click();
        driver.findElementById("editable_title").sendKeys("Appium Live Project");
        driver.findElementById("edit_note_text").sendKeys("This is automation test creating google note");
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        String note= driver.findElementByXPath("//android.widget.TextView[@text='Appium Live Project']").getText();
        Assert.assertEquals(note, "Appium Live Project");
    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}