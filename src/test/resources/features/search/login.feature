Feature: Proyecto Yevo - POC

  Background: Open website
   # Given User opens the website

  @web
  Scenario: Login to Yevo website
    Given the user enters the credentials document number "47475818" and password "12345"
    Then Yevo home page should be displayed
    And Username "prueba" should be displayed


  Scenario: Login to Yevo website mobile
    Given I want to search Yevo in google
    When the client clicks on Yevo link
    Then Yevo home page should be displayed

  @last
  Scenario Outline: Registrar nuevo usuario
    Given El usuario abre el sitio de Yevo
    Then El usuario hace click en Registrarme ahora
    And El usuario completa los campos obligatorios "<documentNumber>", "<phone>", "<name>", "<lastName>", "<secondLastName>"

    Examples:
    |documentNumber| phone | name | lastName| secondLastName|
    |837373838     | 9898987787| Renzo | Flores | Gomez |
    |547464646     | 9898987888| Ruby | Suarez | Torres |