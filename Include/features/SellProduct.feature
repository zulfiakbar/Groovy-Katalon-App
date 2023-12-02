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

  @AddNewProductWithoutInputProductName
  Scenario: User want to add new product to sell without fill Nama Produk field
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Tambah button
    And User input "" on Nama Produk field
    And User input "100000" on Harga Produk field
    And User select "Kesehatan" on Kategori dropdown field
    And User input "Jogja" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify alert name cant be blank show up

  @AddNewProductWithoutInputProductPrice
  Scenario: User want to add new product to sell without fill Harga Produk field
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Tambah button
    And User input "Produk Group 1" on Nama Produk field
    And User input "" on Harga Produk field
    And User select "Kesehatan" on Kategori dropdown field
    And User input "Jogja" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify alert price cant be blank show up

  @AddNewProductWithoutInputProductCategory
  Scenario: User want to add new product to sell without fill Kategori field
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
    And User select "" on Kategori dropdown field
    And User input "Jogja" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify alert category cant be blank show up

  @AddNewProductWithoutInputProductLocation
  Scenario: User want to add new product to sell without fill Lokasi field
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
    And User input "" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify alert location cant be blank show up

  @AddNewProductWithoutInputProductDescription
  Scenario: User want to add new product to sell without fill Deskripsi field
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
    And User input "" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file
    And User click on Terbitkan button
    Then User verify alert description cant be blank show up

  @AddNewProductWithoutInputProductPhoto
  Scenario: User want to add new product to sell without fill Foto Produk field
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
    And User click on Terbitkan button
    Then User verify alert photo cant be blank show up

  @AddNewProductWithInputBigSizeProductPhotoFile
  Scenario: User want to add new product to sell with upload big image file size in Foto Produk field  (> 5 MB)
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
    And User input big size product image file
    And User click on Terbitkan button
    Then User verify product alert Request Entity Too Large show up

  @AddNewProductAsGuestUser
  Scenario: Guest User want to sell product
    Given User is on SecondHand App
    When User click on Tambah button
    Then User verify alert login to continue show up
