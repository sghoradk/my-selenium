package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Contains all locators & methods for login page

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("Email");
	By next = By.id("next");
	By password = By.id("Passwd");
	By signin = By.id("signIn");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginToGmail (String uid, String passwd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(next).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(signin).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(uid));
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
		