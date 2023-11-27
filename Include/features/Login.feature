@Login
Feature: Login

  @login1
		Scenario: User want to login using correct username and password
	  Given User is on SecondHand App
	  When User Click Masuk Button
	  Then User input "erlangga@mailinator.com" into Email field
	  And User input "Test1234" into Password field
	  And User click on Masuk button
   
	@login2
		Scenario: Using want to login using unregistered email
		Given User in on SecondHand App
		When User Click Masuk Button 
		Then User input "erlangga2@mailinator.com" into email filed
		And User input "Test1234" into Password field
	  And User click on Masuk button
   
   @login3
	   Scenario: User want to login without fill Email Field
	   Given User in on SecondHand App
		 When User Click Masuk Button 
		 Then User input "" into email filed
	   And User input "Test1234" into Password field
	   And User click on Masuk button
   
   @login4
	  Scenario: User want to login without fill Password Field
	  Given User in on SecondHand App
		When User Click Masuk Button 
		Then User input "" into email filed
	 	And User input "" into Password field
	  And User click on Masuk button
	   
   @login5
		Scenario: User want to login with invalid password
	  Given User is on SecondHand App
		When User Click Masuk Button
		Then User input "erlangga@mailinator.com" into Email field
		And User input "wrongpass" into Password field
		Then User click on Masuk button
   
   @login6
	  Scenario: User want to login with invalid email format (without domain extension)
	  Given User is on SecondHand App
		When User Click Masuk Button
		Then User input "erlangga@mailinator" into Email field
		And User input "Test1234" into Password field
		Then User click on Masuk button
		
		@login6
		Scenario: User want to login with invalid email format (without @ character)
		Given User is on SecondHand App
		When User Click Masuk Button
		Then User input "erlanggamailinator.com" into Email field
		And User input "Test1234" into Password field
		Then User click on Masuk button
