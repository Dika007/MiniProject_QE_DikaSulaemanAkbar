Feature: Hello

  Scenario: Index
    Given I set endpoints Index
    When I send HTTP request Index
    Then I receive valid HTTP response code 200 Index

  Scenario: wrong index
    Given I set endpoints wrong index
    When I send HTTP request wrong index
    Then I receive valid HTTP response code 404 wrong index

