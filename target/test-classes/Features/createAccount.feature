@JohnLewisCreateAccount
Feature: Create an account

  Scenario: Create an account

    Given I navigate to 'https://www.johnlewis.com/' homepage
    And I accept all cookies
    And I click on login to john lewis button
    And I should see the login page
    And I select create an account button
    And I should see the 'Create an account' page
    And I enter my email and password
      | email         | password |
      | test@test.com | Test1234 |
    And I select subscribe option
      | subscribe | JohnLewis | Waitrose | JohnLewisFinancial |
      | yes       | N/A       | N/A      | N/A                |
    And I click on create account button
