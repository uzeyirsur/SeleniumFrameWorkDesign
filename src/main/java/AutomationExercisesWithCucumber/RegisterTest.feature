@login
Feature: As a user we would like to log in with correct email adress and password

  Background:
    Given the user landed on Home Page

  Scenario Outline:The user successfully logs in with valid credentials and delete his account.
    Then the user sees Home Page
    When the user click SignupLogin button
    Then the user see Login to your account message
    When the user enters email address <emailAddress>
    And the user enters password <password>
    And the user clicks Login button
    Then the user sees logged in as username
    When the user clicks Delete Account button
    Then "Account Deleted!" message displayed on the DeleteAccountPage
    Examples:
      | emailAddress | password  |
      | uzey@gmail   | 1212wewqe |











