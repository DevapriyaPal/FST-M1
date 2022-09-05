package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","Alamgir's M51");
        dcap.setCapability("appPackage", "com.android.chrome");
        dcap.setCapability("appActivity","com.google.android.apps.chrome.Main");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void googleChromeTest() {
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(text(\"To-Do List\"))")).click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys("Add tasks to list");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys("Get number of tasks");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys("Clear the list");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='\uF1F8']").click();

        int taskCount= driver.findElementsByXPath("//com.android.chrome[@resource-id='tasksCard']").size();
        Assert.assertEquals(taskCount,0);


    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}