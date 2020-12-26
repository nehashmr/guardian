Feature:Verify Add New button on All Guardians Page
  As a admin user
  I should be able to see the Add Guardian page when i click on the Add New Button

  @addNewBtn
  Scenario: validate Add New Button
    Given I click on "Guardians" from navigation menu
    When I click on "All Guardian" from submenu
    When I click on Add New Button on the page
    Then I should see the Add Guardian Page.
