Feature: Cucumber Tests

  Scenario: Ensure that gradle can execute cucumber tests
    Given the project has a setup setp
    When the user runs build
    Then a cucumber test should be invoked