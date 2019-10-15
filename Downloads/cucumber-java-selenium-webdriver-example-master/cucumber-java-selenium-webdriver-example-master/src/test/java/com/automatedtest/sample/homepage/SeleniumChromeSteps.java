package com.automatedtest.sample.homepage;

import org.junit.Assert;

import com.automatedtest.sample.basepage.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumChromeSteps extends BasePage{

	private SeleniumChrome seleniumChrome;

	public SeleniumChromeSteps() {
		seleniumChrome = new SeleniumChrome();
	}


	@When("^redirect it to loc\\.gov$")
	public void redirect_it_to_loc_gov() {
		seleniumChrome.goToHomePage();
	}

	@Then("^I should be seeing www\\.loc\\.gov homepage$")
	public void i_should_be_seeing_www_loc_gov_homepage() {
		 String displayedTitle = driver.getTitle();
	        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + "Home | Library of Congress",
	                displayedTitle.contains("Home | Library of Congress"));
	}

	@Given("^Open the web browser$")
	public void open_the_web_browser() {
	    // Write code here that turns the phrase above into concrete actions
		seleniumChrome.goToHomePage();
	}

	@When("^Redirect it loc\\.gov$")
	public void redirect_it_loc_gov() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User Click on$")
	public void user_Click_on() {
		// Write code here that turns the phrase above into concrete actions
		seleniumChrome.clickCongressLink();
		
		System.out.println(" browser");
	}

}
