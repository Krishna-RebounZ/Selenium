package stepdefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageimplementations.closebrowserimpl;
import pageimplementations.openbrowserimpl;
import pages.closebrowserpage;
import pages.openbrowserpage;

public class login{
	WebDriver driver;
	
	
	
	@Given("user open the browser")
	public void user_open_the_browser() {
		openbrowserpage obj = new openbrowserimpl(driver);
	    driver = obj.openBrowser(driver);
		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	    
	}

	@Then("user is navigated to dashboard")
	public void user_is_navigated_to_dashboard() {
	    
	}
	@Then ("user closes the browser")
	public void user_closes_the_browser() {
		closebrowserpage obj = new closebrowserimpl(driver);
		obj.closeBrowser(driver);
		
	}
	
}