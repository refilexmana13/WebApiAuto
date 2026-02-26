@api
Feature: My API

  Scenario: Create a new user
    Given I have the API endpoint
    When I send a POST request to the endpoint with user data
    Then I should receive a 200 status code

  Scenario: Get list users
    Given I have the API endpoint
    When I send a GET request to the endpoint
    Then I should receive a 200 status code