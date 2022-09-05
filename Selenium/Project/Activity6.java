package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {

	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        //driver.get("https://alchemy.hguy.co/lms/");
	        driver.get("https://alchemy.hguy.co/lms");
	    }
	    @Test
	    public void loginToLMS() {
	    	
	    	
	    	WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	    	MyAccount.click();
	    	
	    	WebElement Login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	    	Login.click();
	    	
	    	WebElement UserName = driver.findElement(By.id("user_login"));
	    	UserName.click();
	    	UserName.sendKeys("root");
	    	
	    	WebElement Password = driver.findElement(By.id("user_pass"));
	    	Password.click();
	    	Password.sendKeys("pa$$w0rd");
	    	
	    	WebElement LoginToApp = driver.findElement(By.id("wp-submit"));
	    	LoginToApp.click();
	    
	    	WebElement YourCourses = driver.findElement(By.xpath("//*[contains(text(),'Your Courses')]"));
	    	YourCourses.click();
	   
	    }
	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}