# Author: Sharanya Ravindran
# Login functionality of OrangeHRM

Feature: Feature to test login functionality
Scenario: Check the successful login with valid inputs
Given user is on the login page
When user enters valid username and password
And user clicks login button
Then user is navigated to the home page


 