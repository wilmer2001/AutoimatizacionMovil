Feature: Formulario Contacto

  @SmokeTest
  Scenario: Ingresar en el aplicativo de Forms
    Given Ingresar al aplicativo de Forms
    When Dar clic en crear Formulario
    And Seleccionar el tipo de Formulario a Diligenciar
    Then Validar el ingreso al formulario de contacto


  @SmokeTest2
  Scenario: Ingresar Titulo y Descripcion del Formulario
    Given Ingresar a la aplicacion de Forms
    When Dar clic en Formulario de Contacto
    When Ingresar el titulo
    When Ingresar Descripcion
    Then Validar el Ingreso de los datos en Titulo y Descripcion

