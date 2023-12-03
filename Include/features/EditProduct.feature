@EditProduct
Feature: EditProduct

  @Edit1
  Scenario: User want to edit product detail
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field "Sepatu" at NAMA PRODUK
    And User fill text field "17000" at HARGA PRODUK
    And User select category "Elektronik"
    And User fill text field "malang" at LOKASI PRODUK
    And User fill text field "Mainnya Hebat" at DESKRIPSI
    And upload photos at FOTO PRODUK
    And User click PERBARUI PRODUK button
    Then User successfully edit product detail

  @Edit2
  Scenario: User want to edit product detail without fill NAMA PRODUK
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field "" at NAMA PRODUK
    And User click PERBARUI PRODUK button
    Then User will show up error message under field NAMA PRODUK

  @Edit3
  Scenario: User want to edit product detail without fill HARGA PRODUK
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field "" at HARGA PRODUK
    And User click PERBARUI PRODUK button
    Then User will show up error message under field HARGA PRODUK


  @Edit5
  Scenario: User want to edit product detail without fill LOKASI PRODUK
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field "" at LOKASI PRODUK
    And User click PERBARUI PRODUK button
    Then User will show up error message under field LOKASI PRODUK

  @Edit6
  Scenario: User want to edit product detail without fill DESKRIPSI
    Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field "" at DESKRIPSI
    And User click PERBARUI PRODUK button
    Then User will show up error message under field DESKRIPSI
