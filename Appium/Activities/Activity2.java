package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","SamsungM51");
        dcap.setCapability("appPackage", "com.android.chrome");
        dcap.setCapability("appActivity","com.google.android.apps.chrome.Main");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer,dcap);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void browserTest() throws InterruptedException {
        driver.get("https://www.training-support.net/");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
        String heading= driver.findElementByXPath("//android.widget.TextView[@text='Training Support']").getText();
        System.out.println("Heading of the page is: "+heading);
        driver.findElementByXPath("//android.view.View[@content-desc='About Us']").click();
        Thread.sleep(5000);
        String newHeading= driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
        System.out.println("Heading of about us page is: "+newHeading);

    }

    @AfterClass
    public void closeTest(){
//        driver.quit();
    }
}