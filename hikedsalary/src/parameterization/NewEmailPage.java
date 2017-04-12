package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewEmailPage {
	WebDriver driver;

	By to = By.xpath("//textarea[@name='to']");
	By sub = By.xpath("//input[@name='subjectbox']");
	By body = By.xpath("//div[@class='Am Al editable LW-avf']");
	By send = By.xpath("//div[@role='button'][@data-tooltip='Send ‪(Ctrl-Enter)‬']");
	
	public NewEmailPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendEmail(String recipent, String subject, String emailbody)
	{
		//HomePage home = new HomePage(driver);
		driver.findElement(to).sendKeys(recipent);
		driver.findElement(sub).sendKeys(subject);
		driver.findElement(body).sendKeys(emailbody);
		driver.findElement(send).click();
		//driver.findElement(home.sentmail).click();
		
	}

}
