Feature: Products

  Scenario: Get all products
    Given I set endpoints get all product
    When I send HTTP request get all product
    Then I receive valid HTTP response code 200 get all product

  Scenario: Create a new product
    Given I set endpoints new product
    When I send HTTP request new product
    Then I receive valid HTTP response code 200 new product

  Scenario: Create a new product without a description
    Given I set endpoints without a description
    When I send HTTP request without a description
    Then I receive valid HTTP response code 200 without a description

  Scenario: Create new products without price
    Given I set endpoints without price
    When I send HTTP request without price
    Then I receive valid HTTP response code 400 without price

  Scenario: Get product By ID
    Given I set endpoints get product by ID
    When I send HTTP request get product by ID
    Then I receive valid HTTP response code 200 get product by ID

  Scenario: Get product By ID without Authorization
    Given I set endpoints get product by ID without Authorization
    When I send HTTP request get product by ID without Authorization
    Then I receive valid HTTP response code 200 get product by ID without Authorization

  Scenario: Delete a product
    Given I set endpoints Delete a product
    When I send HTTP request Delete a product
    Then I receive valid HTTP response code 200 Delete a product

  Scenario: Assign a product rating
    Given I set endpoints Assign a product rating
    When I send HTTP request Assign a product rating
    Then I receive valid HTTP response code 200 Assign a product rating

  Scenario: Assign a product rating without Authorization
    Given I set endpoints Assign a product rating without Authorization
    When I send HTTP request Assign a product rating without Authorization
    Then I receive valid HTTP response code 401 Assign a product rating without Authorization

  Scenario: Get product ratings
    Given I set endpoints Get product ratings
    When I send HTTP request Get product ratings
    Then I receive valid HTTP response code 200 Get product ratings

  Scenario: Create a comment for product
    Given I set endpoints create comment product
    When I send HTTP request create comment product
    Then I receive valid HTTP response code 200 create comment product

  Scenario: Create a comment for product without Authorization
    Given I set endpoints create comment product without Authorization
    When I send HTTP request create comment product without Authorization
    Then I receive valid HTTP response code 401 create comment product without Authorization

  Scenario: Get product comments
    Given I set endpoints Get product comments
    When I send HTTP request Get product comments
    Then I receive valid HTTP response code 200 Get product comments