# new feature
# Tags: optional

Feature: All login page test

  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    When I enter correct username and password
    And I click on login button
    Then I should be on home page