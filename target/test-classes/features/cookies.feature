Feature: In order to improve the shopping experience the user wants to accept all cookies on the page.

  Rule: Accept all Cookies

    Background:
      Given I open the home page

    Scenario:
      When I accept cookies
      Then the cookies are disappeared
      And Home page still visible



