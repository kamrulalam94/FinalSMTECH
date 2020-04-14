@001
Feature: Final Project of SM Tech

  Scenario: User run that website without error
    Given User go this Url
    And go to sign in button and click it
    And print website Tittle
    When put User name and password then click it
    And Click on upper left corner Dresses
    And Print all dresses by Descending order
    Then select the second dresses on that list
    And verify Total price including shipping charge
   	Then Logout and close the window
   	
   	
   	
