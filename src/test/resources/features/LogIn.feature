Feature: LogIn process
  Rule: LogIn is successful
    Scenario:
      Given the "https://bevasarlas.tesco.hu/groceries/hu-HU" page
      When the page is loaded
      Then the user fills the appropriate fields
      And the user clicks on "Bejelentkezés" button
      Then LogIn is successful.




Feature: As a registered user I want to be able to successfully log in to the site with my email address and password

  Rule: Login with an existing user

    Background:
      Given I open main page
      And I accept cookies

    @TC_Login
    Scenario: Login
      When I login with the following user:
        | email         |     password      |
        | test@test.com | Passwd123         |
      Then headerline contains the word "<name>"
      When click on the logout button
      Then login button is present