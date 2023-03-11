Feature: Bookcart Application Tests

  Background:
#    Given User navigates to the BookCart application login
    Given User click on the login button

  @smoke @reg
  Scenario: Login should be success
    And User enters the username as "akperrine"
    And User enters the password as "Practice123"
    When User clicks on the login button
    Then Login should be success

  @reg
  Scenario: Login should not be success
    And User enters the username as "ak"
    And User enters the password as "1234"
    When User clicks on the login button
    Then Login should fail