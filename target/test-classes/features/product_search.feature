Feature: The user wants to find products on the page by using the search box.

  Rule: If the user type a product into the search field, the product will be displayed

    Background:
      Given I open the home page
      And I accept cookies

    Scenario Outline:
      When I search for the "<productName>"
      Then Search results loaded
      And "<numOfProducts>"  products are displayed and the product's name contains "<productName>"
      And header contains the word "<productName>"
      And a product's name contains the "<productName>"

      Examples:
        | productName | numOfProducts |
        | milka       | 88            |
        | gesztenye   | 9             |

