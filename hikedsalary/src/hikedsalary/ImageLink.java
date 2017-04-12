package hikedsalary;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImageLink {
	
	public static void main(String[] args) { 
		 
	 	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
        
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]"));
		
		System.out.println(driver.getTitle());
		/*//Selecting Items in a Multiple SELECT elements
		driver.get(http://jsbin.com/osebed/2);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana")
		fruits.selectByIndex(1);*/
		
		driver.quit();
 }
}

