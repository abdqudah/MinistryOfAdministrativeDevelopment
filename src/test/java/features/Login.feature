Feature: Login into Application

Scenario: Postive test validating login 
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And click on the login link in home page to land on secure sign in page
When User enters "username" and "password" and log in
Then Verify that user is successfully looged in

