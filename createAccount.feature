Feature: Create new account in Salesforce application
Background: Positive login 
Given Enter username as 'priyav@testleaf.com'
And Enter password as 'India123'
When Click on the login button
Then Verify whether home page is displayed

Scenario Outline: Create new account with data
Given Click toggle menu button from left corner
And Click view all
And Click Sales link
When Click on Accounts tab
And Click on New in Accounts
When Type the Account name as <accountname>
And Select Ownership as Public
And Click Save button in new Account page
Then Verify the Account name is updated as <accountname>

Examples:
|accountname|
|Priya|