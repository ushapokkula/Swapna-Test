
Feature:Create an Hotel entry

  Background:

    Given I navigate to the site
    And I click "Login" button
    And I login as an admin to the site with "admin" and "password"

  Scenario: Verify the creation of single entry
    Given I enter "hotel-a" as hotel name
    And I enter "address-a" as address
    And I enter "owner-a" as ownner
    And I enter "phonenumber-a" as phonenumber
    And I enter "test@test.com" as email
    When I click Create button
    Then I see that the record is created


  Scenario: Verify the deletion of created hotel entry
    When I delete the entry
    Then I see that the record is deleted

  Scenario: Verify the multiple hotel entry creation
    When I enter multiple entry of hotel creation with following details
      | hotel_name | address_name | owner_name | phone_number | email          |
      | Hotel-1    | Address-1    | Owner-1    | 9999999999   | test1@test.com |
      | Hotel-2    | Address-2    | Owner-2    | 8888888888   | test2@test.com |
      | Hotel-3    | Address-3    | Owner-3    | 7777777777   | test3@test.com |
    Then I see that the three record are created


