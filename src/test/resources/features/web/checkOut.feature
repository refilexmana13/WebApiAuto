@web
Feature: Test Checkout Product

  Background:
    Given I have logged in

  Scenario: add item to cart and check it out
    When I am on inventory page
    And I see product named "Sauce Labs Bike Light"
    And I click add to cart
    And I open cart page
    Then cart should have 1 item
    And I click check out button
    And I fill check out data with "Testing" , "checkout", and "12123"
    And I click finish
    Then I should see "Thank you for your order!"