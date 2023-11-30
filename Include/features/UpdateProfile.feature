@UpdateProfile
Feature: Update Profile

  @UserWantToUpdateProfilePictureFromGallery
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
