Feature: Application login

Scenario: Homepage


Given user is on netbaning landing page
When user login to application with "jhon" and "thlk" 
Then home page is populated
And cards are displayed

Scenario: Homepage
Given user is on netbaning landing page
When user login to application with "rAJU" and "RANI" 
Then home page is populated
And cards are displayed



