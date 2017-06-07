package com.gmail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;

public class DemoAlert {
	
	
	/*@Test
	public void testAlert()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/PersonalSpace/MySelenium/Alert_Practice.htm");
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	*/
	/*@Test
	public void testNaviInterfce()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		driver.navigate().refresh();
		driver.quit();
	}*/
	
	@Test
	public void testLinks()
	{
		Logger log = Logger.getLogger("testLinks");
		PropertyConfigurator.configure("D:\\PersonalSpace\\MySelenium\\log4j.properties");
		
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com");
		log.info("######Browser Opened####");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.quit();
	}

}
