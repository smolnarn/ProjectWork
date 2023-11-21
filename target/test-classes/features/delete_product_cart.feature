Feature: The user wants to delete products from the cart.

  Rule: Selected product is deleted from the cart

    Background:
      Given I open the home page
      And I accept cookies
      And I add a product to the cart
      And the product has been added to the cart

    Scenario:
      When I open the cart
      And I delete a product from the cart
      Then the product is deleted from the cart
      And the cart is empty