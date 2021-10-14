Feature: To check the Buy Items functionality 
Scenario: To check if user is successful to buy items with valid credentials 
	Given User is  on login page 
	And User enters the details 
	And Clicks on Estimate shipping 
	And User check the box to accept the terms and services 
	When User clicks on checkout 
	Then user is navigated to the Checkout Page 
	
	
	
Scenario: To check if user is able to proceed after entering valid credentials 
	Given User is on Checkout page 
	And   User enters the valid details in fields 
	When   User hits enter on Continue button 
	Then   user is able to proceed further 
	
	
	
Scenario: To check if user is able to proceed after entering invalid 
	credentials 
	Given   User landed on Checkout page 
	And   User enters the alphanumeric details in First Name 
	When   User press click on Continue button 
	Then   user is able to go ahead 
	
	
Scenario: To check if user is able to proceed after leaving the mandatory 
	fields 
	Given   User gets on Checkout page 
	And   User enters the valid First name, Last name 
	When   User is proceed to click on Continue button 
	Then   user gets a message displayed 
	
	
Scenario: To check if user is able to proceed after entering invalid credentials 
	Given   User is Checkout page 
	And   User enters the First name, Last name 
	And   User enter the Email without special character '@' 
	When   User clicks on Continue button 
	Then   user gets a message 
