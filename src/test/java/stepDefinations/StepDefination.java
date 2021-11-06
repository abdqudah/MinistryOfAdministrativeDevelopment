package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefination extends Base {

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}
	@Given("Navigate to {string} site")
	public void navigate_to_site(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(URL);
	
	}
	@Given("click on the login link in home page to land on secure sign in page")
	public void click_on_the_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage land = new LandingPage(driver);
		land.getSignIn().click();
	}
	
	@When("^User enters (.+) and (.+) and log in$")
    public void user_enters_and_and_log_in(String username, String password) throws Throwable {
		
		LoginPage loge = new LoginPage(driver);
		loge.getEmailAddress().sendKeys(username);
		loge.getPassword().sendKeys(password);
		loge.getLogin().click();
    }
	
	@Then("Verify that user is successfully looged in")
	public void verify_that_user_is_successfully_looged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	  @And("^Close the browser$")
	    public void close_the_browser() throws Throwable {
		  driver.quit();
	  
	  }


}