package hikedsalary;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstclass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Firefox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }

}
