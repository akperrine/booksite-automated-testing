Feature: Bookcart Application tests

  Background:
    Given User navigates to the BookCart application

  Scenario Outline: Add to cart
    And user login into the application with "<username>" "<password>"
    And user searches for a book "<book>"
    When user adds the book to the cart
    Then the cart badge should get updated

    Examples:
    |username|password|book|
    |akperrine|Practice123|Roomies|
    |akperrine|Practice123|The Simple Wild|