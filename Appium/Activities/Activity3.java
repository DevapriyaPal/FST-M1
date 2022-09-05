package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","SamsungM51");
        dcap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dcap.setCapability("appActivity",".Calculator");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
    }

    @Test
    public void calculator(){
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_add").click();
        driver.findElementById("calc_keypad_btn_09").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String addResult= driver.findElementById("calc_edt_formula").getText();
        System.out.println("Addition Result is: "+addResult);
        Assert.assertEquals(addResult,"14");

        driver.findElementById("calc_keypad_btn_01").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_sub").click();
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String subResult= driver.findElementById("calc_edt_formula").getText();
        System.out.println("Subtraction Result is: "+subResult);
        Assert.assertEquals(subResult,"5");

        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_mul").click();
        driver.findElementById("calc_keypad_btn_01").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String mulResult= driver.findElementById("calc_edt_formula").getText();
        System.out.println("Multiplication Result is: "+mulResult);
        Assert.assertEquals(mulResult,"500");

        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_div").click();
        driver.findElementById("calc_keypad_btn_02").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String divResult= driver.findElementById("calc_edt_formula").getText();
        System.out.println("Division Result is: "+divResult);
        Assert.assertEquals(divResult,"25");


    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}