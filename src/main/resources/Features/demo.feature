#Comentarios

  @SmokeFeature
Feature: feature to test login functionality


#  @smokeTest
  Scenario: scenario: Check login successful with valid credentials

  Given user is on login page
  When user enters username and password
  And clicks on login button
  Then user is navigate o Home page



  Scenario: platanos en la estufa

    Given comprar platanos
    When pelar los platanos
    And cortar los platanos
    Then Prender la estufa

