import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  /**
 * Student Name: Manpreet Kaur
 * Student ID: 738175
 *
 */
public class Selenium{

    public Selenium() {
    	
    
    
    	final String URL = "www.blazedemo.com";
    	final String DRIVER_PATH = "/Users/manpreetkaurgill/Desktop/chromedriver";
    	
    	WebDriver driver;
    	
    @Before
    public void setup() throws Exception {
      
        System.setProperty("chrome driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @After
    public void teardown() throws Exception {
        Thread.sleep(300);			
        TimeUnit.SECONDS.sleep(1);	
        driver.close();
    }


  
    public void testNumberofLinks() {

      
        List<WebElement> listOfLinks = driver.findElements(By.cssSelector("table+ul li a"));

    
        int numLinks = listOfLinks.size();

    
        assertEquals(3, numLinks);

    }
    }
   
}