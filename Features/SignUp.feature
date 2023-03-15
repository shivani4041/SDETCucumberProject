Feature: Sign up for a new account
  As a new user I want to sign up for a new account so that I can access the website's features

  Scenario: Successful sign-up
    Given User launch the chrome
    And User opens URL "www.w3schools.com"
    When User enters valid Email as "abc@gmail.com" and Password as "admin"
    And click on sign up button
    And user enter firstname as "shivani" and lastname as "chaudhari"
    And verify in the email sent in the email address
    Then page title should be "My learning | W3Schools"
    When User click on log out link
    Then Page title should be "Log in - W3Schools"
    And close browser
