package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.selector;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	
WebDriver driver;
WebElement element;
	
	By gmaildropdown = By.xpath(".//*[@id=':i']/div");
	By task = By.xpath(".//*[@id=':l2']/div");
	//Select gmaildropdown = new Select(driver.findElement(By.id(":i")));
	By compose = By.xpath("//body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div");
	By sentmail = By.xpath("//a[@title='Sent Mail']");
			
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void composeEmail()
	{
		driver.findElement(compose).click();
	}
	
	By spam = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#spam']");
	By deletespam = By.xpath("//span[@class='x2'][@role='button']");
	By hoverstarred = By.xpath("//a[@title='Starred']");
	By acceptdeletespam = By.xpath("//button[@name='ok']");
	By verifysmapdelete = By.xpath("//body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/table/tbody/tr/td");
	
	String expected = "Hooray, no spam here!";
	public String actual;
	
	public void deleteSpam()
	{
		WebDriverWait wait=new WebDriverWait(driver,15);
		Actions builder=new Actions(driver);
		 
		// find the tooltip/helptext message xpath
		WebElement hover=driver.findElement(hoverstarred);
		 
		// Mouse hover to that text
		builder.moveToElement(hover).perform();
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(spam));
		
 		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();
 
		// if else condition
		if (status) 
		{
			System.out.println("===== WebDriver is visible======");
			driver.findElement(spam).click();
			//driver.findElement(deletespam).click();
			//driver.findElement(acceptdeletespam).click();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			actual = driver.findElement(verifysmapdelete).getText();
			System.out.println("Value of actual in HomePage: " + actual);
		} 
		else 
		{
			System.out.println("===== WebDriver is not visible======");
		}
		//return actual;
 
	}
		
	/*public void clickGmail()
	{
		driver.findElement(gmaildropdown).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	/*public void clickTask()
	{
		driver.findElement(task).click();
	}*/

	
}
