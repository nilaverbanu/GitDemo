Feature: Login to the application
Scenario: Validation of login

Given user is on home page
When user enter with usernmae "mngr176543" and password "upepUga"
Then welcome page should be displayed