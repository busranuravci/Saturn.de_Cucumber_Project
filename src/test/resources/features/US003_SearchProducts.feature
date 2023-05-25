
@search1
  Feature: US_003 Saturn.de Search Testing

    Background: user go to Saturn.de
      Given user go to "webURL" website


    Scenario: TC01 Search Product 1 Test

      Then user search "<dyson>" on search box
      And user wait 2 seconds
      And user dismiss all cookies
      And user wait 2 seconds
      And user click first dyson's picture
      And  user wait 2 seconds
      And user checks dyson price
      And  user wait 2 seconds
      And user click add cart button
      And user wait 2 seconds
      And user dismiss first offer
      And user wait 2 seconds
      And user dismiss second offer



    Scenario: TC02 Search Product 2 Test

      Then user search "<iphone 14>" on search box
      And user wait 2 seconds
      And user click first iphone's picture
      And  user wait 2 seconds
      And user checks iphone price
      And user wait 2 seconds
      And user click add cart button
      And  user wait 2 seconds
      And user dismiss first offer
      And  user wait 2 seconds
      And user click check out button
      And user wait 2 seconds
      And user check total price
      And close driver

