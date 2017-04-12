package com.gmail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Contains all locators & methods for login page

public class LoginPage1 {

	WebDriver driver;
	
	By username = By.id("Email");
	By next = By.id("next");
	By password = By.id("Passwd");
	By signin = By.id("signIn");
	
	public LoginPage1 (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginToGmail (String uid, String passwd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(next).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(signin).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
}
