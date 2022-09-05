package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

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
	    	
	    	
	    	WebElement MostPopularCourses = driver.findElement(By.xpath("//*[contains(text(),'Our Most Popular Courses')]"));
	    	MostPopularCourses.click();
	    	
	    	WebElement SecondMostPopularCourses = driver.findElement(By.xpath("//*[contains(text(),'Email Marketing Strategies')]"));
	    	SecondMostPopularCourses.click();
	    	
	    	
	    	//String title = driver.getTitle();
	    	System.out.println("Second Most Popular Courses is: " + SecondMostPopularCourses);
	    	Assert.assertEquals("Email Marketing Strategies", SecondMostPopularCourses);
	    }
	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}