Feature: Bookcart Application Tests

  Scenario: Login should be success
    Given User navigates to the BookCart application
    And User click on the login button
    And User enters the username as "akperrine"
    And User enters the password as "Practice1234"
    When User clicks on the login button
    Then Login should be success

  Scenario: Login should not be success
    Given User navigates to the BookCart application
    And User click on the login button
    And User enters the username as "ak"
    And User enters the password as "123"
    When User clicks on the login button
    Then Login should fail