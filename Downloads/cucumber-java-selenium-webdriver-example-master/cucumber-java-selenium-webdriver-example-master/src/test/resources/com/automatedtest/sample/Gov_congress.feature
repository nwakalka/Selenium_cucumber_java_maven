Feature: Chrome browser Application
  Test the loc.gov and click on congress.gov link
    	user should be able to click and sreach in the sreach box

  Scenario: Open the Google chrome browser
    Given Open the chrome browser and Redirec it to loc.gov
     When I click on Congress.gov
      And I click on sreach bar and sreach health care
      And I click on sreach bar icon
      And I click on "H.R.525" link
     Then I verfiy that i land on the correct website
