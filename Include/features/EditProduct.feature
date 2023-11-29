@EditProduct
Feature: EditProduct

  @Edit1
  Scenario: User want to edit product detail
    Given User is on SecondHand App
   Given User is on SecondHand App
    When User click AKUN icon
    Then User click Masuk Akun Button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click product card that want to edit
    And User fill text field at "Nama Produk"
    And User fill text field at "Harga Produk"
    And User fill text field at "Lokasi"
    And User fill text field at "Deskripsi"
    And upload photos at FOTO PRODUK
    And User click PERBARUI PRODUK button
    Then User successfully edit product detail
