Feature: Login to CStoreIQ

  Scenario: Valid login
    Given I am on the login page
    When I enter username "Pratik" and password "Qa@123456"
    And I click the login button
    Then I should be logged in successfully
