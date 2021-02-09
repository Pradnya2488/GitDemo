package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import Utilities.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDefinition extends base{
	public static Logger log=LogManager.getLogger(HomeStepDefinition.class.getName());	
WebDriver driver;
	
	
	
@Given("Navigate to Home page {string} using {string}")
	public void open_page_and_navigate_to(String url, String browsername) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	   driver=initializeDriver(browsername,url);
	   log.info("Driver initialised");
	   
	}
	
	@When("I click Alert button")
	public void i_click_Alert_button() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage home=new HomePage(driver);
	   home.clickAlertButton().click();
	   log.info("Alert button clicked");
	}

	@Then("Verify Alert window is displayed")
	public void verify_Alert_window_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage home=new HomePage(driver);
		log.info(home.validateAlertBox());
		 log.info("Alert box text validated");
		 
	}

}
