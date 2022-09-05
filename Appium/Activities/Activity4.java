package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","SamsungM51");
        dcap.setCapability("appPackage", "com.samsung.android.app.contacts");
        dcap.setCapability("appActivity","com.samsung.android.contacts.contactslist.PeopleActivity");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
    }

    @Test
    public void createNewContact() throws InterruptedException {
        driver.findElementById("menu_create_contact").click();
        Thread.sleep(5000);
        driver.findElementById("nameEdit").sendKeys("Aaditya Varma");
//        driver.findElementByXPath("//android.widget.EditText[@text='Name']").sendKeys("Aaditya Varma");
        driver.findElementById("titleText").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
        driver.findElementById("menu_done").click();
        Thread.sleep(2000);
        String header= driver.findElementById("header").getText();
        Assert.assertEquals(header,"Aaditya Varma");

    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}