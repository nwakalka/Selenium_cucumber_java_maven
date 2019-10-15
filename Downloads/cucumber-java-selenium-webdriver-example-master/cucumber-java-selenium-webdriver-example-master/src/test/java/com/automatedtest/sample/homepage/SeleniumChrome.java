package com.automatedtest.sample.homepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automatedtest.sample.basepage.BasePage;

public class SeleniumChrome extends BasePage{

	private static final String URL = "https://www.loc.gov";
	private static final String CongressLink = "//ul[@class='programs-items']//a[contains(text(),'Congress.gov')]";
	//ul[@class='programs-items']//a[contains(text(),'Congress.gov')]
	
	SeleniumChrome() {
        PageFactory.initElements(driver, this);
    }
	
	 void goToHomePage(){
	        driver.get(URL);
	        wait.forLoading(5);
	    }

	 void checkTitle(String title) {
	        String displayedTitle = driver.getTitle();
	        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
	                displayedTitle.contains(title));
	    }
	 
	 void clickCongressLink(){
		 WebElement element = driver.findElement(By.xpath(CongressLink));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).click().perform();
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
	 }

}
