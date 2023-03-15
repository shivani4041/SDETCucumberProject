Feature: Search Functionality
As a new user I want to sign up for a new account so that I can access the website's features

Scenario: Successful search
		Given User launch the chrome browser
		And User opens url "https://www.w3schools.com/"
		When User want to search for tutorials as "java tutorial" in the search bar
		Then user see a list of tutorials
		When suggestion contians as "java tutorial"
		Then User click on suggested tutorial
		And close browser
    
Scenario: Unuccessful sign-up
    Given User launch the chrome browser
    And User opens url "https://www.w3schools.com/"
    When User want to search for tutorials as "xyz" in the search bar
    Then user does not see any suggestion
    And close browser   
 
  