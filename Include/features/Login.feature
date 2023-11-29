@Login
Feature: Login

  @login1
  Scenario: User want to login using correct username and password
	  Given User is on SecondHand App
	  When User click AKUN icon
	  And User click MASUK button
	  And User input "erlangga421@mailinator.com" into EMAIL field
	  And User input "Test1234" into PASSWORD field
	  And User click on Masuk button
#	  Then User is on Akun saya page

  @login2
  Scenario: User want to login using unregistered email
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga@mailinator.com" into EMAIL field
    And User input "Test1234" into PASSWORD field
    And User click on Masuk button
    #Then User is on Akun saya page

  @login3
  Scenario: User want to login without fill Email Field
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "" into Email field
    And User input "Test1234" into PASSWORD field
    And User click on Masuk button
    #Then User is on Akun saya page

  @login4
  Scenario: User want to login without fill Password Field
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "" into Email field
    And User input "" into Password field
    And User click on Masuk button
    #Then User is on Akun saya page

  @login5
  Scenario: User want to login with invalid password
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga421@mailinator.com" into Email field
     And User input "Test" into PASSWORD field
    Then User click on Masuk button
    #Then User is on Akun saya page

  @login6
  Scenario: User want to login with invalid email format (without domain extension)
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlangga@mailinator" into Email field
    And User input "Test1234" into PASSWORD field
    Then User click on Masuk button
    #Then User is on Akun saya page

  @login7
  Scenario: User want to login with invalid email format (without @ character)
    Given User is on SecondHand App
    When User click AKUN icon
    And User click MASUK button
    And User input "erlanggamailinator.com" into Email field
    And User input "Test1234" into PASSWORD field
    Then User click on Masuk button
    #Then User is on Akun saya page
   


