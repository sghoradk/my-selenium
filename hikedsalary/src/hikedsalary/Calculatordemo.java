package hikedsalary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Calculatordemo {
	static final Logger logger = LogManager.getLogger(Calculatordemo.class.getName());

	public static void main(String[] args) {
		
		DOMConfigurator.configure("logs.xml");
	    logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
	    logger.info("TEST Has Started");
		WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	driver = new FirefoxDriver();
        //String baseUrl = "http://www.calculator.net/";
        
        // launch Fire fox and direct it to the Base URL
        //driver.get(baseUrl);
        driver.navigate().to("http://www.calculator.net/");
        logger.info("Open Calc Application");
        
        // To click BMI Calculator link - By.linkText, By.cssSelector
    	//driver.findElement(By.linkText("BMI Calculator")).click();
        
        By css = By.cssSelector("a[href='/bmi-calculator.html']");
        WebElement element = driver.findElement(css);
        element.click(); 
        
        //sendKeys 
        WebElement textboxage = driver.findElement(By.id("cage"));
        textboxage.clear();
        textboxage.sendKeys("30");
        
        //Radio button
        driver.findElement(By.id("csex2")).click();
        System.out.println("The Output of the IsSelected " + driver.findElement(By.id("csex2")).isSelected());
        System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("csex2")).isEnabled());
        System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("csex2")).isDisplayed());
        
        
        //Height -- Feet
        WebElement textboxfeet = driver.findElement(By.id("cheightfeet"));
        textboxfeet.clear();
        textboxfeet.sendKeys("5");
        
        //Height -- Inches
        WebElement textboxinch = driver.findElement(By.id("cheightinch"));
        textboxinch.clear();
        textboxinch.sendKeys("3.5");
        
        //Weight -- Pounds
        WebElement textboxweight = driver.findElement(By.id("cpound"));
        textboxweight.clear();
        textboxweight.sendKeys("120");
        
        //Click Calculate
        driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[2]/table[4]/tbody/tr/td[1]/input[2]")).click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
        
    	//close Firefox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
	}

}
