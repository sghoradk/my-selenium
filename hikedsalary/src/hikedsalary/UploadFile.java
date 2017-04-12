package hikedsalary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "https://www.naukri.com/";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement uploadres = driver.findElement(By.id("input_resumeParser"));
		uploadres.sendKeys("D:\\Yash_Ghoradkar_Resume(1).Doc");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}


//id="input_resumeParser"