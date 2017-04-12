package hikedsalary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// To access elements in a table using xpath

public class AccessTableElements {

	public static void main(String[] args) { 
		 
	 	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "http://newtours.demoaut.com/mercurycruise.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Value of getText: " + 
		driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/"
				+ "table/tbody/tr[2]/th/table/tbody/tr[10]/td[2]/font")).getText());
		driver.quit();
 }
}
