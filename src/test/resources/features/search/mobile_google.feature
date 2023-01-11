Feature: Search by keyword

  @android
  Scenario: Searching for a term
    Given I want to search Yevo in google in android
    When the client clicks on Yevo link in android
    Then Yevo home page should be displayed in android

