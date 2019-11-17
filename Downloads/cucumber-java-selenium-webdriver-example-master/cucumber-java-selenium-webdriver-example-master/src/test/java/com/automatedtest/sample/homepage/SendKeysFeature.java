package com.automatedtest.sample.homepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class SendKeysFeature extends BasePage {

	private static final String URL = "https://www.loc.gov";

	
	SendKeysFeature() {
		PageFactory.initElements(driver, this);
		
	}

	void goToHomePage() {
		driver.get(URL);
		wait.forLoading(5);
	}
	
	public void sendKeys(){
		WebElement textField = driver.findElement(By.xpath("//input[@id='search']"));
		textField.sendKeys("congress.gov");
		textField.sendKeys(Keys.ENTER);
	}
	
	public void clickSearchButton(){
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='header-search-button']//i[@class='icon icon-search']"));
		searchButton.click();
		wait.forLoading(5);
	}

	public void assertCheck() {
		Assert.assertEquals(driver.getTitle(),"Search results for Congress.gov, Available Online | Library of Congress");

	}
	
	
}
