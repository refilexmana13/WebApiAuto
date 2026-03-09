@web
Feature: Test Inventory Page

  Background:
    Given I have logged in

  Scenario: Check inventory, test add and remove, click continue shopping
    Given I am on inventory page
    And I should see list item is displayed
    And I add Backpack to cart
    And I open cart page
    And I click remove
    And I click continue shopping
