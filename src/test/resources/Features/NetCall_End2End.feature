@NetCall
Feature: NetCall End 2 End Application

  Scenario: application page
    Given I navigate to 'https://matssoft-operations-recruit.onmats.com/w/webpage/203BDEFF3'
    And I am in the application page
    And I would like to have a loan in below details
      | Amount | Term | Reason        |
      | 2500   | 25   | Refurbishment |
    When I press next
    Then I am in the 'Personal' page

#  Scenario: Personal page
    Given I am in the 'Personal' page
    And I complete the below fields
      | Forename | Surename | DOB        | email         | PhoneNumber |
      | Test     | Testing  | 20/10/1978 | test@test.com | 07511111111 |
    When I press next
    Then I am in the 'Address' page

#  Scenario: Address page
    Given I am in the 'Address' page
    And I complete the address details
      | AddressLine1 | AddressLine2 | Town_City     | PostCode |
      | street 01    | Street 02    | Milton Keynes | MK123AB  |
    When I press next
    Then I am in the 'Finance' page

#  Scenario: Finance page
    Given I am in the 'Finance' page
    And I complete the Finance details
      | BankName | SortCode | AccountNumber |
      | Halifax  | 12-12-12 | 12345678      |
    When I press next
    Then I am in the 'Review' page

#  Scenario: Review page
    Given I am in the 'Review' page
    And I check the review information based on my details
      | Amount         | 2500  ???     |
      | Term           | 25    ???     |
      | Reason         | Refurbishment |
      | Forename       | Test          |
      | Surename       | Testing       |
      | DOB            | 20/10/1978    |
      | email          | test@test.com |
      | PhoneNumber    | 07511111111   |
      | AddressLine1   | street 01     |
      | AddressLine2   | Street 02     |
      | Town_City      | Milton Keynes |
      | PostCode       | MK12 3AB      |
      | BankName       | Halifax       |
      | SortCode       | 12-12-12      |
      | AccountNumber  | 12,345,678    |
#      Account number shows incorrectly
      | Interest       | 2.5% ???      |
      | MonthlyPayment | ???           |
    When I click next on review page for confirmation
    Then I am in the Confirmation page
    And I click on new application
    And I am in the application page
    