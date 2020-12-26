Feature:Verify Guardian creation
  As a admin user
  I should be able to add Guardian details

  @validData
  Scenario: verify using valid data
    Given I click on "Guardians" from navigation menu
    When I click on "Add New Guardian" from submenu
    Then I provide the First Name "Dave"
    Then I provide the Last Name "King"
    Then I provide the Email "dave.king@mailinator.com"
    Then I provide the Phone "7654890234"
    Then I click on "Add Guardian" Button

  @invalidData
  Scenario: verify using invalid email and phone number
    Given I click on "Guardians" from navigation menu
    When I click on "Add New Guardian" from submenu
    Then I provide the First Name "Daniel"
    Then I provide the Last Name "King"
    Then I provide the Email "daniel.king@mailinator"
    Then I provide the Phone "765489034"
    Then I click on "Add Guardian" Button

  @noData
  Scenario: verify using no data
    Given I click on "Guardians" from navigation menu
    When I click on "Add New Guardian" from submenu
    Then I provide the First Name ""
    Then I provide the Last Name ""
    Then I provide the Email ""
    Then I provide the Phone ""
    Then I click on "Add Guardian" Button
    Then I take a Screenshot
