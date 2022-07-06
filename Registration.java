package com.selenium.project;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Registration {

	public static void main(String[] args) {
		
		String path="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/itctesting03/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/index.html");
		//first name
		driver.findElement(By.id("firstname")).sendKeys("Bhavani");
		
		//last name
		driver.findElement(By.id("lastname")).sendKeys("Vankam");
		
		//date of birth
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("06072001");
		
		//email
		driver.findElement(By.id("email")).sendKeys("bhavani@gmail.com");
		
		//phone number
		driver.findElement(By.id("phonenumber")).sendKeys("8008448651");
		
		//gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(1);
		
		//address
		driver.findElement(By.id("address")).sendKeys("Proddatur, Kadapa");
		
		//state
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Andhra Pradesh");
		state.selectByIndex(11);
		
		//resume upload
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("D:\\Bhavani_Resume.pdf");
		
		//registration date
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");
		
		////password
		driver.findElement(By.id("password")).sendKeys("Bhavani@123");
		
		//confirm password
		driver.findElement(By.id("confirm-password")).sendKeys("Bhavani@123");
		
		//agree terms and condition
		driver.findElement(By.id("agree")).click();
			
		//register
		driver.findElement(By.id("submit-btn")).click();
		
		//alert
		driver.switchTo().alert().accept();
	}

}