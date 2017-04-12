package hikedsalary;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//Keyboards and mouse event using Action class
// This ex shows drag and drop -- WHICH IS NOT WORKING

public class DragnDrop {

	public static void main(String[] args) { 
		 
	 	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "https://www.w3schools.com/html/html5_draganddrop.asp";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement srcimage = driver.findElement(By.cssSelector("img[id=\"drag1\"]"));
		WebElement destination = driver.findElement(By.cssSelector("div[id=\"div2\"]"));
		
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action dragndrop = builder.dragAndDrop(srcimage, destination).build();
		dragndrop.perform();
		driver.quit();
 }
}
