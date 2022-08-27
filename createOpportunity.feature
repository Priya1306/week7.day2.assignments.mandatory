Feature: Create new opportunity in Salesforce application
Background: Positive login
Given Enter username as 'priyav@testleaf.com'
And Enter password as 'India123'
When Click on the login button
Then Verify whether home page is displayed

Scenario Outline: Create new opportunity with data
Given Click toggle menu button from left corner
And Click view all
And Click Sales link
When Click on Opportunity tab
And Click on New in opportunity
When Type the Opportunity name as <opportunityname>
And Choose the close date as today
And Select the stage as Need Analysis
And Click Save button in new opportunity page
Then Verify the opportunity name is updated as <opportunityname>

Examples:
|opportunityname|
|Salesforce automation by Priya|
