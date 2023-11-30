@Delete
Feature: DeleteProduct

  @tag1
  Scenario: User want to delete product
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click on trash button
    And App will show popup
    Then User successfully delete product
