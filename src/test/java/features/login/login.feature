
  Feature: log in
     @login
       
    Scenario: user should able to log in successfully

      Given I am on homepage
      And   I click on login button
      And   I enter login details
      And   I logged in successfully