Feature: Order


  Scenario: Create a new order
    Given I set endpoints Create a new order
    When I send HTTP request Create a new order
    Then I receive valid HTTP response code 200 Create a new order

  Scenario: Create a new order without Authorization
    Given I set endpoints Create a new order without Authorization
    When I send HTTP request Create a new order without Authorization
    Then I receive valid HTTP response code 401 Create a new order without Authorization

  Scenario: Get all orders
    Given I set endpoints Get all orders
    When I send HTTP request Get all orders
    Then I receive valid HTTP response code 200 Get all orders

  Scenario: Get all orders without Authorization
    Given I set endpoints Get all orders without Authorization
    When I send HTTP request Get all orders without Authorization
    Then I receive valid HTTP response code 401 Get all orders without Authorization

  Scenario: Get order by ID
    Given I set endpoints Get order by ID
    When I send HTTP request Get order by ID
    Then I receive valid HTTP response code 200 Get order by ID

  Scenario: Get order by ID without Authorization
    Given I set endpoints Get order by ID without Authorization
    When I send HTTP request Get order by ID without Authorization
    Then I receive valid HTTP response code 401 Get order by ID without Authorization

