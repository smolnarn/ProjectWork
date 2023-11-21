Feature: Products are displayed
  Rule: Only "Összes Karácsonyi készülődés" products appears
    Scenario:
      Given Welcome page on Tesco bevásárlás page
      When the user select "Bevásárlás" menu
      And the user select "Karácsonyi készülődés" menu
      And the user select "Összes Karácsonyi készülődés" menu
      Then "Összes Karácsonyi készülődés" page is loaded

