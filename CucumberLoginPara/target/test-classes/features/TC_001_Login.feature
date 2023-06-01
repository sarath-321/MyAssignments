Feature: Login functionality of Leaftaps application

Background:
Given Open the browser
And Load the url

@smoke
Scenario: Login for positive testcase
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Home page should be displayed

#Scenario: Login for invalid credential
#Given Enter the username as 'Demo'
#And Enter the password as 'crmsfa'
#When Click on Login button
#But Error message should be displayed
