
Feature: Delete User

  Scenario Outline: User deleting
    Given I am in delete page
    When I enter 'User_Name' the value "<User_Name>"
    And click delete
    Then A "<Message>" must beee appear

    Examples:
      | User_Name | Message                   |
      | fadi28  | User deleted successfully |

