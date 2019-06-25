Feature: Create login in Zomato

Scenario Outline: Multiple account creation in zomato should be possible
Given User triggers the application url
And triggers the login page
When provides the <email id> and <name>
Then the account is created

Examples:
|email id	|name	|
|chandi.barbie@gmail.com	|vaishnavi	|
|riya.ark@g,gmail.com	|priya	|






