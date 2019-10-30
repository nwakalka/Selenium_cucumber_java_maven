package com.automatedtest.sample.homepage;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class Display_congress extends BasePage {

	private static final String URL = "https://www.loc.gov";
	private static final String CongressLink = "//ul[@class='programs-items']//a[contains(text(),'Congress.gov')]";
	private static final String CongressSearchhBar = "//input[@id='search']";
	private static final String SearchBarIcon = "//button[@id='search-submit']";
	private static final String HealthCareLink = "//body/div/div/main/div/div/div/div/ol/li[1]/span[1]";
	private static final String CheckTitelDisplay = "//h1[@class='legDetail']";
	// ul[@class='programs-items']//a[contains(text(),'Congress.gov')

	Display_congress() {
		PageFactory.initElements(driver, this);
		commonBase = new CommonBase();
	}

	void goToHomePage() {
		driver.get(URL);
		wait.forLoading(5);
	}
	
	private CommonBase commonBase;

	void checkTitle(String title) {
		String displayedTitle = driver.getTitle();
		Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
				displayedTitle.contains(title));
	}

	void clickCongressLink() {
		commonBase.clickCongressLinkBase(CongressLink);
	}

	void clickCongressSearchBar() {
		commonBase.clickCongressSearchBarBase(CongressSearchhBar);
	}

	void clickOnSreachBarIcon() {
		commonBase.clickOnSreachBarIconBase(SearchBarIcon);
	}

	void clickOnhealthCareLink() {
		commonBase.clickOnhealthCareLinkBase(HealthCareLink);	
	}
	
	
	void checkTitle1() {
		//assert.assertTrue(driver.findElement(By.xpath(CheckTitelDisplay))));
    }
	
}
