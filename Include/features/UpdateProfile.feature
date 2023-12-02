@UpdateProfile
Feature: Update Profile

  @UpdateProfilePictureFromGallery
  Scenario: User want to update profile picture from gallery
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Image field
    And User click on Galeri button
    And User input profile picture file
    Then User verify profile updated

  @UpdateProfilePictureBigSizeFile
  Scenario: User want to update profile picture from gallery by choosing big size image file (> 5 MB)
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Image field
    And User click on Galeri button
    And User input big size image profile picture file
    Then User verify profile alert Request Entity Too Large show up

  @UpdateProfilePictureFromCamera
  Scenario: User want to update profile picture from camera
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Image field
    And User click on Camera button
    And User take a picture from camera window
    Then User verify profile updated

  @UpdateProfileName
  Scenario: User want to update profile name
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Nama field
    And User input "Erlangga" into Nama field
    And User click on Simpan button
    Then User verify profile updated

  @UpdateProfileTelephoneNumber
  Scenario: User want to update profile telephone number
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Nomor HP field
    And User input "08987654321" into Nomor HP field
    And User click on Simpan button
    Then User verify profile updated

  @UpdateProfileCity
  Scenario: User want to update profile city
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Kota field
    And User input "Jogja" into City field
    And User click on Simpan button
    Then User verify profile updated

  @UpdateProfileAddress
  Scenario: User want to update profile address
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
    And User input "Test1234" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Alamat field
    And User input "Jl. Kaliurang" into Alamat field
    And User click on Simpan button
    Then User verify profile updated

  @UpdateProfilePassword
  Scenario: User want to update profile password
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlanggachangepw@mailinator.com" into Email field
    And User input "12345678" into Password field
    And User click on Masuk button
    Then User is on Akun saya page
    And User click on Edit button
    And User click on Password field
    And User input "12345678" into Recent Password field
    And User input "Test1234" into New Password field
    And User input "Test1234" into Confirmation Password field
    And User click on Simpan button
    Then User verify profile updated
