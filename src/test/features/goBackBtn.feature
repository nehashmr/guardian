Feature:Verify Go Back feature on Add Guardian Page
  As a admin user
  I should be able to see the dashboard when i click on the GO Back Button

  @goBack
  Scenario: validate go back button
    Given I click on "Guardians" from navigation menu
    When I click on "Add New Guardian" from submenu
    When I click on Go Back Button on the page
    Then I should see the dashboard.
