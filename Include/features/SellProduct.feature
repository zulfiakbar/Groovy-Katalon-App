@SellProduct
Feature: Sell Product

  @AddNewProductWithValidInput
  Scenario: User want to add new product to sell with fill all field with valid data
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Tambah button
    And User input "Produk Group 1" on Nama Produk field
    And User input "100000" on Harga Produk field
    And User select "Kesehatan" on Kategori dropdown field
    And User input "Jogja" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify product added
