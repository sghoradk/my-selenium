package hikedsalary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "http://filehippo.com/download_ccleaner/download/5a9c8633b09f7cc60f94e311abdc517c/";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		WebElement downloadlink = driver.findElement(By.id("download-link"));
		
		String sourcelocation = downloadlink.getAttribute("href");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate" + sourcelocation;
		driver.switchTo().alert().accept();
		try {
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
		
		driver.quit();
	}
}

//<a href="current/wget64.exe">wget64.exe</a>