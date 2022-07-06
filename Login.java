package com.selenium.project;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void main(String[] args) {
		
		
		String path="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/itctesting03/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/index.html");
		driver.findElement(By.id("phone-email")).sendKeys("bhavani@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Bhavani@123");
		driver.findElement(By.id("submittion")).click();

	}

}