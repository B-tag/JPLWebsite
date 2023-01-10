@NetCall2
Feature: NetCall End 2 End Application

  Scenario Outline: application page
    Given I navigate to 'https://matssoft-operations-recruit.onmats.com/w/webpage/203BDEFF3'
    And I am in the application page
#    And I enter the "<Amount>" and "<Term>" and select "<Reason>" I borrow money
#    And I

    Examples:
      | Amount | Term | Reason | Forename | Surename | DOB | email | PhoneNumber | AddressLine1 | AddressLine2 | Town_City | PostCode | BankName | SortCode | AccountNumber |
      |        |      |        |          |          |     |       |             |              |              |           |          |          |          |               |
