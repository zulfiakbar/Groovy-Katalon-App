@Notification
Feature: Notification

#  @NotificationAfterCreateProduct
#  Scenario: User will received notification for newly created product
#    Given User is on SecondHand App
#    When User click AKUN icon
#    And User click MASUK button
#    And User input "erlangga441@mailinator.com" into Email field
#    And User input "Test1234" into Password field
#    And User click on Masuk button
#    Then User is on Akun saya page
#    And User click on DAFTAR JUAL SAYA
#    And User click on trash button
#    And App will show popup
    #    Then User successfully delete product
#    And User click BACK button in DAFTAR JUAL SAYA
#    And User click on Tambah button
#    And User input "Whey Protein" on Nama Produk field
#    And User input "100000" on Harga Produk field
#    And User select "Kesehatan" on Kategori dropdown field
#    And User input "Jogja" on Lokasi field
#    And User input "Deskripsi Produk" on Deskripsi field
#    And User click on Foto Produk field
#    And User click on Galeri button
#    And User input product image file
#    And User click on Terbitkan button
#    Then User verify product added
#    And User click NOTIFICATION icon
#    And User refresh the page
#    And User click the first notification

  @NotificationAfterReceivedOffer
  Scenario: User will received notification for newly offered product
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga441@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on DAFTAR JUAL SAYA
    And User click on trash button xpath
    And App will show popup
    #    Then User successfully delete product
    And User click BACK button in DAFTAR JUAL SAYA
    And User click on Tambah button
    And User input "kel 1 abc" on Nama Produk field
    And User input "100000" on Harga Produk field
    And User select "Kesehatan" on Kategori dropdown field
    And User input "Jogja" on Lokasi field
    And User input "Deskripsi Produk" on Deskripsi field
    And User click on Foto Produk field
    And User click on Galeri button
    And User input product image file from vivo
    And User click on Terbitkan button
    Then User verify product added
    And User click BACK button in DAFTAR JUAL SAYA
    # 		And User click AKUN icon
    And User click KELUAR button
    Then User click AKUN icon
    And User click MASUK button
    And User input "erlangga99@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click BERANDA icon
    And User input "kel 1 abc" into Search field
    And User click the first search card
    Then User can see product detail
    And User click SAYA TERTARIK DAN INGIN NEGO button
    And User fill "1700" price field
    And User click KIRIM button
    Then Message Harga tawarmu berhasil dikirim ke penjual will be shown
    And User click BACK button in product detail
    And User click BACK button in search
    And User click AKUN icon
    And User click KELUAR button
    Then User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click NOTIFICATION icon
    And User refresh the page
    And User click the first notification
