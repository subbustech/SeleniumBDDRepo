Feature: Car Rental Testing Feature

#Scenario: Car Rental Login Scenario
#	
#Given user is on admin login page
#When Title of the login page is Admin Login
#Then user enters username and password
#Then user clicks on login button
#Then user clicks on dashboard
#Then Heading on the page is dashboard

#Scenario: Car Rental Login Scenario
	
#Given user is on admin login page
#When Title of the login page is Admin Login
#Then user enters "admin" and "Test@12345"
#Then user clicks on login button
#Then user clicks on dashboard
#Then Heading on the page is dashboard

#Scenario Outline: Car Rental Login Scenario
#	
#Given user is on admin login page
#When Title of the login page is Admin Login
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user clicks on dashboard
#Then Heading on the page is dashboard
#
#Examples:
#	| username | password |
#	| admin | Test@12345 |
#	| admin | Test@12345 |

#Scenario Outline: Car Rental Login Scenario
#	
#Given user is on admin login page
#When Title of the login page is Admin Login
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user clicks on dashboard
#Then Heading on the page is dashboard
#Then user clicks on vehicles on left naviagion
#Then user clicks on post a vehicle on left naviation
#Then user enters vehicle details "<vehicletitle>" and "<vehicleoverview>" and "<priceperday>"
#Then user closes the browser
#
#Examples:
#	| username | password |	vehicletitle | vehicleoverview | priceperday |
#	| admin | Test@12345 | BMW | BMW for Rent | 90 |
#	| admin | Test@12345 | FORD | Ford for Rent | 100 |

Scenario: Car Rental Login Scenario
	
Given user is on admin login page
When Title of the login page is Admin Login
Then user enters login details
| admin | Test@12345 |
Then user clicks on login button
Then user clicks on dashboard
Then Heading on the page is dashboard
Then user clicks on vehicles on left naviagion
Then user clicks on post a vehicle on left naviation
Then user enters vehicle details 
| BMW | BMW for Rent | 90 |
Then user closes the browser