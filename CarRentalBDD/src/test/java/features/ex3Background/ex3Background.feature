Feature: Car Rental Testing Feature

Background: Car Rental Login Scenario
Given user is on admin login page
When Title of the login page is Admin Login
Then user enters username and password
Then user clicks on login button
Then user clicks on dashboard
Then Heading on the page is dashboard

Scenario: Verify Manage Bookings
Then user clicks on Manage Bookings
Then user verifies that the heading is Manage Bookings
Then user closes the browser

Scenario: Verify Manage Testimonials
Then user clicks on Manage Testimonials
Then user verifies that the heading is Manage Testimonials
Then user closes the browser