Feature: Create new dashboard in Salesforce application
Background: Positive login
Given Enter username as 'priyav@testleaf.com'
And Enter password as 'India123'
When Click on the login button
Then Verify whether home page is displayed

Scenario Outline: Create new dashboard with data
Given Click toggle menu button from left corner
And Click view all
And Click on Dashboards link
And Click on New Dashboard option
When Type the name as <dashboardname>
And Click Create button in new dashboard page
And Click Done in dashboard page
When Click on Dashboards tab 
And Type the search box as <dashboardname>
Then Verify the dashboard name as <dashboardname>

Examples:
|dashboardname|
|Salesforce Automation by Priya|