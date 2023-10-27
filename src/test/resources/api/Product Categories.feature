Feature: Product Categories


  Scenario: Create a category
    Given I set endpoints Create a category
    When I send HTTP request Create a category
    Then I receive valid HTTP response code 200 Create a category

  Scenario: Create categories without descriptions
    Given I set endpoints Create a category without descriptions
    When I send HTTP request Create a category without descriptions
    Then I receive valid HTTP response code 200 Create a category without descriptions

  Scenario: Get category by ID
    Given I set endpoints Get category by ID
    When I send HTTP request Get category by ID
    Then I receive valid HTTP response code 200 Get category by ID

  Scenario: Get all categories
    Given I set endpoints Get all categories
    When I send HTTP request Get all categories
    Then I receive valid HTTP response code 200 Get all categories

  Scenario: Delete a category
    Given I set endpoints Delete a category
    When I send HTTP request Delete a category
    Then I receive valid HTTP response code 200 Delete a category