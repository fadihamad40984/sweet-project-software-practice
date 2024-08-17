
Feature: change password

  Scenario: user change his password
    Given the user is in change password page
    When user enter "current_password" and "new_password" and "username"
    Then password will change
