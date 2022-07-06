package selproj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Contact {
	WebDriver driver;
	 @Test
	 public  void tstmd() {
		 String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
		 driver=new ChromeDriver();
			driver.get("file:///C:/Users/itctesting03/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/bhavaniPortfolio/contact.html");
		 String org="Contact Page Launches The Personal Portfolio! ";
			String actual=driver.getTitle();	
			
			driver.findElement(By.id("name")).sendKeys("Bhavani");
			driver.findElement(By.id("email")).sendKeys("1902bhavani@gmail.com");
			driver.findElement(By.id("subject")).sendKeys("Send your Resume");
			driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I know what is the good time to talk with you?");
			driver.findElement(By.id("submit")).click();
		 Assert.assertEquals(org,actual);
	 }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Sending Message");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }


}

	