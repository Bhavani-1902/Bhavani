package com.selenium.project;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Invalidcontact {

	public static void main(String[] args) {
	

		String path="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();


		driver.get("file:///C:/Users/itctesting03/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/bhavaniPortfolio/contact.html");
		driver.findElement(By.id("name")).sendKeys("Bhavani");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("subject")).sendKeys("Send your Resume");
		driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I know what is the good time to talk with you?");
		driver.findElement(By.id("submit")).click();
		// TODO Auto-generated method stub

	}

}
