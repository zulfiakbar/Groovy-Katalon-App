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
    And User input "randomemail" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is on profile page

  @RegisterWithoutFillName
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "" into NAMA field
    And User input "erlanggaabc123@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillEmail
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillPassword
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga973@mailinator.com" into EMAIL field
    And User input "" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillNomorHP
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga974@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillKota
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga975@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillAlamat
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga976@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidEmail
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga977@mailinator" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidEmail2
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga97mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithRegisteredEmail
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidPassword
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga@mailinator.com" into EMAIL field
    And User input "123" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidNomorHPFormat
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga@mailinator.com" into EMAIL field
    And User input "Test123" into PASSWORD field
    And User input "081234568791011121314151617181920" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidNomorHPFormat2
  Scenario: User register account using valid credentials
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlangga@mailinator.com" into EMAIL field
    And User input "Test123" into PASSWORD field
    And User input "abc!@#$%^" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page
