package cucumber;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxProfile;
 
public class BrowserNavigation {
 
	private static WebDriver driver = null;
 
	public static void main(String[] args) {
 
		// Create a new instance of the Firefox driver
		
		FirefoxProfile p = new FirefoxProfile();
		p.setPreference("javascript.enabled", false); 
 
		driver = new FirefoxDriver(p);
		
		// Open ToolsQA website
 
		driver.get("http://www.toolsqa.com");
		
		// Put an Implicit wait on driver
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Click on About link
 
        driver.findElement(By.linkText("ABOUT")).click();
        
		// Put an Implicit wait on driver
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
        
        // Go back to Home Page
 
		driver.navigate().back();
		
		// Put an Implicit wait on driver
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
 
		// Go forward to About page
 
        driver.navigate().forward();
        
		// Put an Implicit wait on driver
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
 
		// Go back to Home page
 
        driver.navigate().to("http://www.toolsqa.com");
 
		// Refresh browser
        
		// Put an Implicit wait on driver
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
 
		driver.navigate().refresh();
 
		// Close browser
 
		driver.close();
		
	}
 
}