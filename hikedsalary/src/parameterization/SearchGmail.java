package parameterization;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
		
	public void searchEmails(String name, String sub)
	{
		show_search_options.click();
		from.sendKeys(name);
		
		
		List <WebElement> listItems = driver.findElements
				(By.xpath("//div[@role='option'][@style='-moz-user-select: none;']"));
		//div id=":sc" class="" style="left: 213px; top: 131px; -moz-user-select: none;" role=""
		System.out.println("Total no of elements are: "+listItems.size());
		
		// Now using Iterator we will iterate all elements
		Iterator<WebElement> i1=listItems.iterator();
		while(i1.hasNext())
		{
		     WebElement ele1=i1.next();
		     String name1=ele1.getText();
		     System.out.println("Elements name is "+name1);
		 }
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
		
		//subject.sendKeys(sub);
		search.click();
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
				
	}
	
}
