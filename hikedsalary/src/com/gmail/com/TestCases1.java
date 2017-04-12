package com.gmail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases1
{
	public String baseUrl = "https://www.google.co.in";
    public String driverpath = "C:\\geckodriver.exe";
    public WebDriver driver;

@BeforeTest
public void launchBrowser()
{
	  System.out.println("Launching FireFox browser");
	  System.setProperty("webdriver.firefox.marionette", driverpath);
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
}


@Test
public void VerifyLogin() 
{
		
		LoginPage1 login = new LoginPage1(driver);
		//HomePage1 home = new HomePage1(driver);
		
		login.loginToGmail("sharujerry", "genpact@123");
		//home.clickGmail();
		//home.clickTask();

}

@Test
public void composeEmail()
{
	
}

@AfterTest
public void closeBrowser()
{
		driver.close();
}
}


