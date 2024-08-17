
Feature: Share Dessert

  Scenario Outline: share Dessert with various inputs
    When user is in share-Dessert page
    And he fills in 'title' with "<Title>" for post
    And he fills in 'description' with "<Description>" for post
    And he fills in 'image' with "<Image>" for post
    And he submits the post button
    Then he should see "<Message>" for post

    Examples:
      | Title                    | Description          | Image                               | Message                |
      | New-Sweet                | Shortbread Cookies   | C:\Users\User\Downloads\des1.png    | Post share successfully|
      | Shortbread Cookies       | white cake           | C:\Users\User\Downloads\des1.png    |Post share successfully |








