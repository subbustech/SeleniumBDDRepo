Feature: Car Rental Testing Feature

Scenario: Car Rental Login Scenario
	
Given user is on admin login page
When Title of the login page is Admin Login
Then user enters username and password
Then user clicks on login button
Then user clicks on dashboard
Then Heading on the page is dashboard
Then user closes the browser