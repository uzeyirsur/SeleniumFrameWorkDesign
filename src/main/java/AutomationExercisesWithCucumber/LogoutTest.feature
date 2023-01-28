@logout
Feature: As a user we would like to log out

  Background:
    Given the user landed on Home Page

  Scenario Outline: The user logs in and then log out successfully
    Then the user sees Home Page
    When the user click SignupLogin button
    Then the user see Login to your account message
    When the user enters email address <emailAddress>
    And the user enters password <password>
    And the user clicks Login button
    Then the user sees logged in as username
    When the user clicks Logout button
    Then the user navigates to log in page
    Examples:
      | emailAddress    | password  |
      | uzey12345@gmail | 1212wewqe |