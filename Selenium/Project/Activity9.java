package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

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
	    public void LessonCompletion() throws InterruptedException {
	    	
	    	
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
	    
	    	WebElement AllCourses = driver.findElement(By.xpath("//*[contains(text(),'All Courses')]"));
	    	AllCourses.click();
	    	Thread.sleep(2000);
	   
	    	WebElement OneCourse = driver.findElement(By.xpath("//*[contains(text(),'Email Marketing Strategies')]"));
	    	OneCourse.click();
	    	Thread.sleep(2000);
	    	
	    	WebElement CourseContent = driver.findElement(By.xpath("//*[contains(text(),'Improving & Designing Marketing Emails')]"));
	    	CourseContent.click();
	    	Thread.sleep(2000);
	    	
	    	String title = driver.getTitle();
	    	System.out.println("Page title is: " + title);
	    	Assert.assertEquals("Improving & Designing Marketing Emails – Alchemy LMS", title);
	    	
	    	WebElement MarkComplete = driver.findElement(By.xpath("/div[contains(@class,'wrapper')]/div[3]/div[2]/form[1]/input[4]"));
	    	MarkComplete.click();
	    }
	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}