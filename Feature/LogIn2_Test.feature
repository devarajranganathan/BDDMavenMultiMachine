Feature: Login2 Action
 
@scenario2 
Scenario: Successful Login2 with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
@scenario2 
Scenario: Successful2 LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully