package com.automatedtest.sample.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automatedtest.sample.basepage.BasePage;

public class CommonBase extends BasePage {

	void clickCongressLinkBase(String x) {
		WebElement element = driver.findElement(By.xpath(x));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	void clickCongressSearchBarBase(String CongressSearchhBar) {
		WebElement element = driver.findElement(By.xpath(CongressSearchhBar));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		actions.moveToElement(element).sendKeys("health care").perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	void clickOnSreachBarIconBase(String SearchBarIcon ) {
		WebElement element = driver.findElement(By.xpath(SearchBarIcon));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	void clickOnhealthCareLinkBase(String HealthCareLink) {
		WebElement element = driver.findElement(By.xpath(HealthCareLink));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);		
	}
}
