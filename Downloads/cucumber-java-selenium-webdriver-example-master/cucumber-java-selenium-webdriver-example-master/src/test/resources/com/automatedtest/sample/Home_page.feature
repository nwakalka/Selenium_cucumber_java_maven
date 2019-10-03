Feature: Home page

  @home_page @home_page_display
  Scenario Outline: Check page display
    Given A user navigates to HomePage
    Then Google logo is displayed

  @home_page @home_page_title
  Scenario: Check title
    Given A user navigates to HomePage
    Then page title is "Google"
