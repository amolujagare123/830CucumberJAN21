# new feature
# Tags: optional

Feature: All login page test

  @dummyLogin
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter correct username and password
    When  I enter  username  as "dhanashree"   and password  as "dhanashree"
    And I click on login button
    Then I should be on home page

  @dummyLogin
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter incorrect username and password
    When  I enter  username  as "admin"   and password  as "admin"
    And I click on login button
    Then I should be on home page

  @dummyLogin
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter blank username and password
    When  I enter  username  as "amol"   and password  as "amol"
    And I click on login button
    Then I should be on home page


   @RealLogin
  Scenario: to test the functionality of login button for valid username and password on billing page
    Given I am on login page of billing
    When I enter correct username and password on billing page
   And I click on login button on billing page
    Then I should be on dashboard of billing page