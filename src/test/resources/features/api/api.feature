@api
Feature: My API

  Scenario: Get list users
    Given I have the API endpoint
    When I send a GET request to the endpoint
    Then I should receive a 200 status code