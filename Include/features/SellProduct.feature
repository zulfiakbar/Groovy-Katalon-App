@SellProduct
Feature: Sell Product

  @UserWantToAddNewProductToSellWithFillAllFieldWithValidData
  Scenario: User want to add new product to sell with fill all field with valid data
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
