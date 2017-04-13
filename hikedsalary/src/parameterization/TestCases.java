package parameterization;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


	public class TestCases 
	{
	
		WebDriver driver;
	    String driverPath = "C:\\geckodriver.exe";
	    
	 	@BeforeTest
	    public void setup(){
	 		System.setProperty("webdriver.firefox.marionette", driverPath);
	 		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			//driver = new ChromeDriver();
	 		driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://mail.google.com");
	    }
	   
	    @Test(priority='1', dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
	    public void loginToGmail (String uid, String passwd)
		{
	    	LoginPage login = new LoginPage(driver);
			login.loginToGmail(uid, passwd);
		 	Assert.assertTrue(driver.getTitle().contains(uid), "Invalid Credentials");
		}
	    
	    /*@Test(priority='2')
	    public void composeEmail()
	    {
	    	HomePage home = new HomePage(driver);
	    	home.composeEmail();
	     }
	    
	    @Test(priority='3', dataProvider="Email", dataProviderClass=DataproviderClass.class)
	    public void sendEmail(String recipent, String subject, String emailbody)
	    {
	    	NewEmailPage email = new NewEmailPage(driver);
	    	email.sendEmail(recipent, subject, emailbody);
	    	//Assert.assertEquals(actual, expected);
	    }*/
	    
	    /*@Test(priority='2')
	    public void deleteSpam()
	    {
	    	HomePage home = new HomePage(driver);
	    	home.deleteSpam();
	    	Assert.assertEquals(home.actual, home.expected);
	    }*/
	    
	    @Test(priority='2', dataProvider="SearchProviderExcel", dataProviderClass=DataProviderExcel.class)
	    public void searchEmails(String from, String subject) throws InterruptedException
	    {
	    	// Created Page Object using Page Factory
	    	SearchGmail search_gmail = PageFactory.initElements(driver, SearchGmail.class);
	    	search_gmail.searchEmails(from, subject);
	    	Assert.assertEquals(search_gmail.actual, search_gmail.expected);
	    }
	    
	    @AfterTest
	    public void close()
	    {
	    	driver.quit();
	    }
	   
	}
