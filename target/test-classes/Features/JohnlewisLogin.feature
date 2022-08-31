@JohnLewisLogin
Feature: Test Login Page

  Scenario: Go to homepage and login

    Given I navigate to 'https://www.johnlewis.com/' homepage
    And I accept all cookies
    When I click on login to john lewis button
    Then I should see the login page