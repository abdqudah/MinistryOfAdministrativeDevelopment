Feature: Login into Application

Scenario Outline: Postive test validating login 
Given Initialize the browser with chrome
And Navigate to GOV site
And click on the login link in home page to land on secure sign in page
When User enters <username> and <password> and log in
Then Verify that user is successfully looged in
And Close the browser

Examples:
|username 		       	|password		|
|test123@gmail.com		|123456			|
|abd.qudah@gmail.com	|111111			|
