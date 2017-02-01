package stepdefinition;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import cucumber.api.java.After;

public class Test_Steps {
	
	private static WebDriver driver = null;
	
	@Before
	public void startup()
	{
		
	}
	
	@After
	public void teardown()
	{
		
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Create a new instance of the Firefox driver
		
				FirefoxProfile p = new FirefoxProfile();
				//p.setPreference("javascript.enabled", false); 
		 
				driver = new FirefoxDriver(p);
				
				// Open ToolsQA website		 
				driver.get("http://www.google.com");				
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		// Put an Implicit wait on driver
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Click on About link
 
		driver.get("http://www.google.com");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		// Put an Implicit wait on driver
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
        
        // Go back to Home Page
 
		driver.navigate().back();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {

		// Go forward to About page
		 
        driver.navigate().forward();
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		// Open ToolsQA website 
		driver.get("http://www.google.com");
		
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		driver.navigate().refresh();
		 
		// Close browser 
		driver.close();
		driver.quit();
	}	

}
