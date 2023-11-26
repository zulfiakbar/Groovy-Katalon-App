@Register
Feature: Register

  @RegisterWithValidCredentials
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga97@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is on profile page