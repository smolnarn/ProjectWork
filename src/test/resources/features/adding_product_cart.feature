Feature: Adding a product to the cart
  Rule: Selected product is added to the cart
    Scenario:
      Given the "Összes Karácsonyi készülődés" page
      When the user select a product
      And the user click the "Hozzáad" button
      Then the product is added to the cart
      And the product appears on the cart


