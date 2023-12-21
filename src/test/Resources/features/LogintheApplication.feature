@functional
Feature: To Login the Application
  Scenario: To login the application with username and password

    Given When I Launch the application
    Then I enter the "username" and "Password"
    Then I click submit button