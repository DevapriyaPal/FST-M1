package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

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
	    public void LMS_TC1() /*{
	    	
	    
	    	String WebPageHeader = driver.getPageSource();
	    	System.out.println("Web Page Header is: " + WebPageHeader);
	    	Assert.assertEquals("Learn from Industry Experts", WebPageHeader);
	    }*/
	  
	    {
        WebElement WebPageHeader = driver.findElement(By.xpath("//*[contains(text(),'Learn from Industry Experts')]"));
        System.out.println("Web Page Header is: " + WebPageHeader.getText());
        Assert.assertEquals("Learn from Industry Experts", WebPageHeader);
	    }
	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}

