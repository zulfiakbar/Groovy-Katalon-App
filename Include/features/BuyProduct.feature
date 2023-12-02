@BuyProduct
Feature: Buy Product

  @BuyProduct1
  Scenario: User want to negotiate and buy product
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And user click home page
    And User click one of product card
    Then User can see product detail
    And User click SAYA TERTARIK DAN INGIN NEGO button
    And User fill "1700" price field
    And User click KIRIM button
    Then User succesfully sent tawar harga

  @BuyProduct2
  Scenario: Guest user want to negotiate and buy product
    Given User is on SecondHand App
    When User click one of product card
    Then User can see product detail
    And User click SAYA TERTARIK DAN INGIN NEGO button
    Then Message Silahkan login terlebih dahulu will be shown
