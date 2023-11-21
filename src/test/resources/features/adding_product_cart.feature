Feature: The user wants to add products to the cart.

  Rule: Selected product is added to the cart

    Background:
      Given I open the home page
      And I accept cookies

    Scenario:
      When I search for "milka"
      And 88 products are displayed and the product's name contains "milka"
      And I add a product to the cart
      Then the product has been added to the cart
