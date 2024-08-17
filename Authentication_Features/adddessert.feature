@Feature1
Feature: Add Dessert

  Scenario Outline: Add Dessert with various inputs
    When user is in Add-Dessert page
    And he fills in 'name' with "<Name>" for Dessert
    And he fills in 'type' with "<Type>" for Dessert
    And he fills in 'price' with "<Price>" for Dessert
    And he submits the addition form
    Then he should see "<Message>" for addition

    Examples:
      | Name                     | Type        | Price  | Message                    |
      | Purple Cake With Figs    | Cakes       | 15     | Dessert added successfully |
      | Shortbread Cookies       | Cookies     | 20     | Dessert added successfully |








