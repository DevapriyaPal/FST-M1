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

public class Activity1 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","Alamgir's M51");
        dcap.setCapability("appPackage", "com.google.android.apps.tasks");
        dcap.setCapability("appActivity",".ui.TaskListsActivity");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void googleTask() {
        driver.findElementById("tasks_fab").click();
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("add_task_done").click();
        String task1= driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Tasks']").getText();
        Assert.assertEquals(task1,"Complete Activity with Google Tasks");

        driver.findElementById("tasks_fab").click();
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("add_task_done").click();
        String task2= driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Keep']").getText();
        Assert.assertEquals(task2,"Complete Activity with Google Keep");

        driver.findElementById("tasks_fab").click();
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("add_task_done").click();
        String task3= driver.findElementByXPath("//android.widget.TextView[@text='Complete the second Activity Google Keep']").getText();
        Assert.assertEquals(task3,"Complete the second Activity Google Keep");

    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}