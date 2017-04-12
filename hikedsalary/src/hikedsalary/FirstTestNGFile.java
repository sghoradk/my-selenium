package hikedsalary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
    public String baseUrl = "https://www.google.co.in";
    public String driverpath = "C:\\geckodriver.exe";
    public WebDriver driver;
    
    /*public void verifyHomePage() {
	  System.out.println("Launching FireFox browser");
	  System.setProperty("webdriver.firefox.marionette", driverpath);
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  String ExpectedTitle = "Google";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  driver.close();
	    
  }*/
    @BeforeTest
    public void launchBrowser()
    {
    	System.out.println("Launching FireFox browser");
  	  System.setProperty("webdriver.firefox.marionette", driverpath);
  	  driver = new FirefoxDriver();
  	  driver.get(baseUrl);
    }
    
    @AfterTest
    public void closeBrowser()
    {
    	driver.close();
    }
    
    @Test
    public void verifyHomePage()
    {
    	String ExpectedTitle = "Google";
  	    String ActualTitle = driver.getTitle();
  	    Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
}
