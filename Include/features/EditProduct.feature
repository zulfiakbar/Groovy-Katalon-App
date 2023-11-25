@EditProduct
Feature: EditProduct

  @Edit1
  Scenario: Title of your scenario outline
    Given User is on SecondHand App
    When User Click "Masuk" Button
    Then User input "erlangga@mailinator.com" into "Email" field
    And User input "Test1234" into "Password" field
    And User click on "Masuk" button
    And User click on "akun" icon
    And User click on "daftar jual saya"
    And User click product card that want to edit
    And User fill text field at "Nama Produk"
    And User fill text field at "Harga Produk"
    And User choose category at KATEGORI
    And User fill text field at "Lokasi"
    And User fill text field at "Deskripsi"
    And upload photos at FOTO PRODUK
    And User click PERBARUI PRODUK button
    Then User successfully edit product detail
