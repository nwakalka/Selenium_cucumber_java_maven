package com.automatedtest.sample.homepage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendKeysFeatureStep {
	
	SendKeysFeature sendKeysFeature;

	 public SendKeysFeatureStep() {
		sendKeysFeature = new SendKeysFeature();
	}
	
	@Given("^Open the browser and Redirec it to loc\\.gov$")
	public void open_the_browser_and_Redirec_it_to_loc_gov() {
		sendKeysFeature.goToHomePage();
	}

	@When("^I click on search text box and search for congress\\.gov$")
	public void i_click_on_search_text_box_and_search_for_congress_gov() {
		sendKeysFeature.sendKeys();
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {
		sendKeysFeature.clickSearchButton();
	}
	
	@Then("^I assert that i land on the correct website$")
	public void i_assert_that_i_land_on_the_correct_website() {
		sendKeysFeature.assertCheck();
	}
}
