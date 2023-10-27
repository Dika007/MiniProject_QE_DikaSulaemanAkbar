Feature: Authentication

  Scenario: registration successful
    Given I set endpoints register
    When I send HTTP request
    Then I receive valid HTTP response code 200

  Scenario: register without email
    Given I set endpoints register1
    When I send HTTP request1
    Then I receive valid HTTP response code 400

  Scenario: register without password
    Given I set endpoints register2
    When I send HTTP request2
    Then I receive valid HTTP response code1 400

  Scenario: register without fullname
    Given I set endpoints register3
    When I send HTTP request3
    Then I receive valid HTTP response code2 400

  Scenario: Register with the email already use
    Given I set endpoints register4
    When I send HTTP request4
    Then I receive valid HTTP response code3 400

  Scenario: successful login
    Given I set endpoints login
    When I send HTTP request login
    Then I receive valid HTTP response code 200 login

  Scenario: login without email
    Given I set endpoints login1
    When I send HTTP request login1
    Then I receive valid HTTP response code 400 login1

  Scenario: login without password
    Given I set endpoints login2
    When I send HTTP request login2
    Then I receive valid HTTP response code 400 login2

  Scenario: Login with an unregistered email
    Given I set endpoints login3
    When I send HTTP request login3
    Then I receive valid HTTP response code 400 login3

  Scenario: Login with wrong password
    Given I set endpoints login4
    When I send HTTP request login4
    Then I receive valid HTTP response code 400 login4

  Scenario: Get user information
    Given I set endpoints information
    When I send HTTP request information
    Then I receive valid HTTP response code 200 information

  Scenario: Get user information without Authorization
    Given I set endpoints information1
    When I send HTTP request information1
    Then I receive valid HTTP response code 401 information1