
Feature: All login page test

  Background: before every scenario
    Given I open browser
   # And  I maxize the nrowser


  @dummyLogin @reg
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter correct username and password
    When  I enter  username  as "dhanashree"   and password  as "dhanashree"
    And I click on login button
    Then I should be on home page

  @dummyLogin @reg
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter incorrect username and password
    When  I enter  username  as "admin"   and password  as "admin"
    And I click on login button
    Then I should be on home page

  @dummyLogin @reg
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



     @userReg @reg
     Scenario:  to verify the user is added or not
       Given i am on user registration page
       When i enter following details
       | amol | ujagare | 787878 | amol@gmail.com |
       And click on submit button
       Then user should be added

       @userReg2
       Scenario Outline: to verify the user is entered or not
         Given i am on user registration page
          When I enter <name> , <email> , <phone>
         And click on submit button
         Then user should be added
         Examples:
           | name  | email  | phone  |
           | name1 | email1 | phone1 |
           | name2 | email2 | phone2 |
           | name3 | email3 | phone3 |
           | name4 | email4 | phone4 |
           | name5 | email5 | phone5 |
           | name6 | email6 | phone6 |


         @forTestingDryRun
         Scenario: to test the functionality of login button for valid username and password
           Given I am on login page
           When  i dont enter username and password
           And I click on login button
           Then I should be on home page
