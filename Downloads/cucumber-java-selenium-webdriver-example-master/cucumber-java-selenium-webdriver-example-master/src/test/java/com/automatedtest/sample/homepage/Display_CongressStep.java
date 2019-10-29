package com.automatedtest.sample.homepage;

import java.sql.Driver;

import org.junit.Assert;

import com.automatedtest.sample.basepage.BasePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Display_CongressStep {

	private Display_congress Display_congress;

	public Display_CongressStep() {
		Display_congress = new Display_congress();

	}

	@Given("^Open the chrome browser and Redirec it to loc\\.gov$")
	public void open_the_chrome_browser_and_Redirec_it_to_loc_gov() {
		Display_congress.goToHomePage();
	}	


	@When("^I click on Congress\\.gov$")
	public void i_click_on_congressgov() {
		Display_congress.clickCongressLink();
	}

	@And("^I click on sreach bar and sreach health care$")
	public void i_click_on_sreach_bar_and_sreach_health_care() {
		Display_congress.clickCongressSearchBar();
	}

	@And("^I click on sreach bar icon$")
	public void i_click_on_sreach_bar_icon() {
		Display_congress.clickOnSreachBarIcon();
	}

	@And("^I click on \"([^\"]*)\" link$")
	public void i_click_on_something_link(String strArg1) {
		Display_congress.clickOnhealthCareLink();
	}

	@Then("^I verfiy that i land on the correct website$")
	public void i_verfiy_that_i_land_on_the_correct_website() {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
