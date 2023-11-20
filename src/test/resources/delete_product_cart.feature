Feature: Delete a product from the cart
  Rule: Deleting is successful
    Scenario:
      Given the Tesco bevásárlás page
      When the user select the cart
      And the "Bevásálás elküldése" button is selected by the user on the cart
      And the delete button is selected by the user
      Then the pruduct is deleted from the cart
      And the cart is empty

