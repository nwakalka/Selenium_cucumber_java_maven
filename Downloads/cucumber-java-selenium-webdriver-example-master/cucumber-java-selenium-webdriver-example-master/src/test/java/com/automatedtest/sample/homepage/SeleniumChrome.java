package com.automatedtest.sample.homepage;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class SeleniumChrome extends BasePage{

	private static final String URL = "https://www.loc.gov";
	
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

}
