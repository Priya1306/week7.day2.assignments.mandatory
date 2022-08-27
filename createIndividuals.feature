Feature: Create new individual in Salesforce application
Background: Positive login
Given Enter username as 'priyav@testleaf.com'
And Enter password as 'India123'
When Click on the login button
Then Verify whether home page is displayed

Scenario Outline: Create new individual with data
Given Click toggle menu button from left corner
And Click view all
And Click on Individuals link
When Click on the dropdown on Individuals tab
And Click on New Individual
When Type the Last name as <individualname>
And Click Save button in new individual page
Then Verify the Individual name is updated as <individualname>

Examples:
|individualname|
|Priya|