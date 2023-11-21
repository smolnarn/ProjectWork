Feature: Accept Cookies
  Rule: Accept all Cookies
    Scenario:
      Given the "https://bevasarlas.tesco.hu/groceries/hu-HU" page
      When the page is loaded
      Then the cookies are displayed
      And user accept All cookies


