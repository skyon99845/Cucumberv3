Feature: User Login to RedBus Website
  Scenario: Verify that User is able to login to his account
    Given The user "mobile number" is given
    When User visits the website
    Then User login into the account