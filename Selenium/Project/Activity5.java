package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {

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
	    public void navigateToMyAccount() {
	    	
	    	
	    	WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	    	MyAccount.click();
	    	
	    	String title = driver.getTitle();
	    	System.out.println("Page title is: " + title);
	    	Assert.assertEquals("My Account – Alchemy LMS", title);
	    }
	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}