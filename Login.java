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

public class Login {
	WebDriver driver;
 @Test
 public  void tstmd() {
	 String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	 driver=new ChromeDriver();
	 driver.get("file:///C:/Users/itctesting03/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/index.html");
	 String org="Login Launches The Personal Portfolio! ";
		String actual=driver.getTitle();	
	     driver.findElement(By.id("phone-email")).sendKeys("bhavani@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Bhavani@123");
		 driver.findElement(By.id("submittion")).click();
	 Assert.assertEquals(org,actual);
 }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Application is starting");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}