Feature: Encuesta

  @SmokeTest
  Scenario: Ingresar en el aplicativo de Forms
    Given Ingresar al aplicativo de Forms
    When Dar clic en crear Formulario
    And Seleccionar el tipo de Formulario a Diligenciar
    Then Validar el ingreso al aplicativo