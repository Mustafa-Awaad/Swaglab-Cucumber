@smoke
Feature: Login with invalid credentials

  Scenario: login with valid user name and invalid password
    When Enter valid user name and invalid password
    Then verify error message of invalid password

  Scenario: login with invalid user name and valid password
    When Enter invalid user name and valid password
    Then verify error message of invalid username