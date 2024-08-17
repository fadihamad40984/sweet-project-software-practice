
Feature: search Dessert

  Scenario Outline: search Dessert with various inputs
    When user is in search-Dessert page
    And he fills in 'name' with "<Name>" for search
    And he fills in 'filter' with "<Filter>" for search
    And he submits the search form
    Then he should see "<Message>" for search

    Examples:
      | Name                     | Filter         | Message                     |
      | Purple Cake With Figs    | alphabet       | Dessert search successfully |









