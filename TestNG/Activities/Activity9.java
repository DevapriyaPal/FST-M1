package suiteExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
    WebDriver driver;
 @BeforeClass

public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\001YD2744\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        driver=new ChromeDriver();
        driver.get(" https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Start the Logs");
     Reporter.log("Page title is " + driver.getTitle() + " |");
    }


    @BeforeMethod
    public void beforeMethod(){
        Reporter.log("Start the Logs");
        driver.switchTo().defaultContent();
    }


    @Test(priority = 0)
    public void simpleAlertTestCase()
    {

        driver.findElement(By.xpath("//*[@id=\"simple\"]")).click();
        Alert alert =driver.switchTo().alert();
        String SimpleAlertText= alert.getText();
        Reporter.log(SimpleAlertText);
        System.out.println(SimpleAlertText);
        driver.switchTo().alert().accept();
        Assert.assertEquals("This is a JavaScript Alert!", SimpleAlertText);

    }

    @Test(priority = 1)
    public void confirmAlertTestCase()
    {
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
        Alert alert =driver.switchTo().alert();
        String ConfirmAlertText=alert.getText();
        alert.accept();
        Reporter.log(ConfirmAlertText);
        System.out.println(ConfirmAlertText);
        Assert.assertEquals("This is a JavaScript Confirmation!", ConfirmAlertText);
    }

    @Test(priority = 2)
    public void promptAlertTestCase()
    {
        driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
        Alert alert =driver.switchTo().alert();
        driver.switchTo().alert();
        alert.sendKeys("Shipra");
        String PromptAlertText=alert.getText();
        System.out.println(PromptAlertText);
        alert.accept();
        Reporter.log(PromptAlertText);
        Assert.assertEquals("This is a JavaScript Prompt!", PromptAlertText);

    }


    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }


}