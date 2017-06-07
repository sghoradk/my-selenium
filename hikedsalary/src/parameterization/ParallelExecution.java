package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	WebDriver driver;
	
	@Test
	
	@Parameters("Browsers")
	public void crossBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
