package hikedsalary;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class AccessDropDown {
	
	static final Logger logger = LogManager.getLogger(AccessDropDown.class.getName());
	
 public static void main(String[] args) { 
	 
	 	DOMConfigurator.configure("logs.xml");
	    logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
	    logger.info("TEST Has Started");
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);

		logger.info("Open tours Application");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ZAMBIA");
		
		logger.info("Zambia is selected");
		System.out.println(driver.getTitle());
		/*//Selecting Items in a Multiple SELECT elements
		driver.get(http://jsbin.com/osebed/2);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana")
		fruits.selectByIndex(1);*/
				
		driver.quit();
 }
}