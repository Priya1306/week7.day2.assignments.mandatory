Feature: Create new opportunity without mandatory fields 
in Salesforce application
Background: Positive login
Given Enter username as 'priyav@testleaf.com'
And Enter password as 'India123'
When Click on the login button
Then Verify whether home page is displayed

Scenario Outline: Create new opportunity without mandatory fields
Given Click toggle menu button from left corner
And Click view all
And Click Sales link
When Click on Opportunity tab
And Click on New in opportunity
And Choose the close date as today
And Click Save button in new opportunity page
Then Verify the alert message displayed for name as <alert>
Then Verify the alert message displayed for stage as <alert>

Examples:
|alert|
|Complete this field|