package parameterization;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.TakesScreenshot;

public class SearchGmail {
	
	WebDriver driver;
	
	public SearchGmail(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//div[@role='button'][@data-tooltip='Show search options']") 
	WebElement show_search_options; 
	 
	@FindBy(how=How.XPATH,using="//input[@class='ZH nr aQa']")
	WebElement from;
	
	@FindBy(how=How.XPATH,using="//input[@id=':l1']")
	WebElement subject;
	
	@FindBy(how=How.XPATH,using="//div[@role='button'][@data-tooltip='Search Mail']")
	WebElement search;
	
	@FindBy(how=How.XPATH,using="//input[@id='gbqfq'][@class='gbqfif']")
	WebElement searchbar;
	
	String expected = "from:rohit";
	String actual;
		
	public void searchEmails(String name, String sub) throws InterruptedException
	{
		show_search_options.click();
		from.sendKeys(name);
		Thread.sleep(7000);
		
		List <WebElement> listItems = driver.findElements
				(By.xpath("//div[@role='option'][@style='-moz-user-select: none;']"));
		//div id=":sc" class="" style="left: 213px; top: 131px; -moz-user-select: none;" role=""
		System.out.println("Total no of elements are: "+listItems.size());
		
		// Now using Iterator we will iterate all elements
		Iterator<WebElement> i1=listItems.iterator();
		while(i1.hasNext())
		{
		     WebElement ele1=i1.next();
		     
		     if(ele1.getText().contains("rohitbijwe@gmail.com"))
		     {
		    	 System.out.println("ele1: " +ele1.getText().contains("rohitbijwe@gmail.com"));
		    	 ele1.click();
		     }
		     String name1=ele1.getText();
		     System.out.println("Elements name is "+name1);
		 }
		
		Thread.sleep(5000);		
		//subject.sendKeys(sub);
		search.click();
		Thread.sleep(5000);
		actual = searchbar.getText();
		System.out.println("Value in searchbar is: " +actual);
		
		//TAKE SCREENSHOT
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:\\PersonalSpace\\MySelenium\\Screenshots\\error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
					
	}
}
