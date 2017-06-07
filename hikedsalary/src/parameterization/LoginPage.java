package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Contains all locators & methods for login page

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("identifierId");
	By next1 = By.id("identifierNext");
	By password = By.xpath("//input[@type='password'][@name='password']");
	By next2 = By.id("passwordNext");
	By signin = By.id("signIn");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginToGmail (String uid, String passwd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(next1).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(password).sendKeys(passwd);
		System.out.println(driver.findElement(next2).isEnabled());
		driver.findElement(next2).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(uid));
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
		