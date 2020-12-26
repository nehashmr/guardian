Feature:Verify Guardian Added
  As a admin user
  I should be able to see the added Guardian details

  @validEmail
  Scenario: verify using valid email address
    Given I click on "Guardians" from navigation menu
    When I click on "All Guardians" from submenu
    Then I should see the email id "dave.king@mailinator.com" on the page

  @inValidEmail
  Scenario: verify using invalid email address
    Given I click on "Guardians" from navigation menu
    When I click on "All Guardians" from submenu
    Then I should see the email id "dav.king@mailinator" on the page

