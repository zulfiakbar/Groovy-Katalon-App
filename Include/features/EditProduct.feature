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
    And User fill text field "sepatu" at NAMA PRODUK
    And User fill text field "17000" at HARGA PRODUK  
    And User select category "Elektronik"
    And User fill text field "malang" at LOKASI PRODUK 
    And User fill text field "Mainnya Hebat" at DESKRIPSI 
    And upload photos at FOTO PRODUK
    And User click PERBARUI PRODUK button
    Then User successfully edit product detail
