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

  Scenario: Get User By ID
    Given I have the API endpoint
    When I send a GET request by ID to the endpoint
    Then I should receive a 200 status code
    And I should see the name

  Scenario: Update User
    Given I have the API endpoint
    When I send a POST request to the endpoint with user data
    And I send a PUT request to the endpoint
    Then I should receive a 200 status code

  Scenario: Delete User
    Given I have the API endpoint
    When I send a POST request to the endpoint with user data
    And I Send a DELETE request to the endpoint
    Then I should receive a 200 status code

  Scenario: Delete with invalid ID
    Given I have the API endpoint
    And I Send a DELETE request with invalid ID
    Then I should receive a 404 status code