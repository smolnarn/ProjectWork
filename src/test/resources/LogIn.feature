Feature: LogIn process
  Rule: LogIn is successful
    Scenario:
      Given the "https://bevasarlas.tesco.hu/groceries/hu-HU" page
      When the page is loaded
      Then the user fills the appropriate fields
      And the user clicks on "Bejelentkezés" button
      Then LogIn is successful.




