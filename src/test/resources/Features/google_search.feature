@Google_search
Feature: google search

  Scenario Outline: multiple google search
    Given I navigate to 'https://www.google.com/' homepage
    When I search for "<text>" in search bar
    Then I take screenshot

    Examples:
      | text       |
      | john lewis |
      | yahoo      |