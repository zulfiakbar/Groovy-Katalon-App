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
    And User input random email into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is on profile page

  @RegisterWithoutFillName
  Scenario: User register account without fill name
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
  Scenario: User register account without fill email
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input nothing into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456789" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithoutFillPassword
  Scenario: User register account without fill password
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
  Scenario: User register account without fill nomor hp
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
  Scenario: User register account without fill kota
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
  Scenario: User register account without fill alamat
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
  Scenario: User register account using invalid email format
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlanggaa977@mailinator" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithInvalidEmail2
  Scenario: User register account using invalid email format 2
    Given User is on the SecondHand App
    When User click AKUN icon
    And User click MASUK button
    Then User click DAFTAR link
    And User is on register page
    Then User input "Erlangga" into NAMA field
    And User input "erlanggaaa97mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User input "08123456879" into NOMOR HP field
    And User input "Jogja" into KOTA field
    And User input "Jl. Kaliurang" into ALAMAT field
    Then User click DAFTAR button
    And User is still on register page

  @RegisterWithRegisteredEmail
  Scenario: User register account with registered email
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
  Scenario: User register account using invalid password
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
