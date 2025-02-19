Feature: Registration Functionality

  Background: Open Chrome Browser
    Given Chrome Browser is opened
    Then User is On Parabank Website

  Scenario: Validate the Register Functionality

    Given Register button is present
    When User clicks on it
    Then Register form gets generated
    When User fills the form
    And Click on Register
    Then User gets logged in