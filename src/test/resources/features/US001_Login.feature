

@hooktest
Feature: US_001 Saturn.de Login Testing

  Scenario: TC01 Positive Login Test
    Given user go to "webURL" website
    Then user click sign in button
    And user wait 2 seconds
    And user click first login button
    And user wait 2 seconds

  Scenario Outline: Information Entry
    And  user logs in with the given information "<email>","<password>"
    And user wait 2 seconds
    And user click second login button
    And user verifies successful login
    And close driver

    Examples:
      | email              | password  |
      | maryjane@gmail.com | test12300 |


