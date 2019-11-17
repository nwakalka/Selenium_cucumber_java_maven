
    Feature: Chrome browser Application
		  Test the loc.gov and click on congress.gov link
    	user should be able to click and sreach in the sreach box

  Scenario: Open the Google chrome browser
    Given Open the browser and Redirec it to loc.gov
     When I click on search text box and search for congress.gov
      And I click on search button
      Then I assert that i land on the correct website
    