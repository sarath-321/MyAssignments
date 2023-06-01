Feature: Create Lead functionality of Leaftaps application

Background:
Given Open the browser
And Load the url

Scenario Outline: Create Lead for valid data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Home page should be displayed
When Click on crmsfa link
And Click on Leads link
And Click on CreateLead link
Given Enter the companyName as <companyName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
When Click on CreateLead button
Then ViewLeadPage should be displayed

Examples:
|companyName|firstName|lastName|
|TestLeaf|John|Wick|
|Qeagle|Romancham|GB|



