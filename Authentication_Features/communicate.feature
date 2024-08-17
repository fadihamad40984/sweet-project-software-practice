
Feature: Communicate
  Scenario Outline: Communicate scenarios
    Given user is in communicate page
    When he fills in 'title' with '<Title>' for message
    And he fills in 'description' with '<Description>' for message
    And user clicks on send
    Then user should see '<message>' for message


    Examples:
      | Title          | Description                | message                    |
      | cake review    | it want more than sugar    | message send successfully  |


