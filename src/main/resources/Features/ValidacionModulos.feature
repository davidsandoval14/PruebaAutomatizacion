Feature: Validar la funcionalidad add new del modulo post
  @Prueba @CP01
  Scenario: Ingresar al cms y validar la funcionalidad add new del modulo post
    Given inicio sesion en el cms con una cuenta con <usuario> y <clave>
    When ingreso al modulo post y acciono el boton add new
    Then valido que cargue correctamente la plantilla del post para modificar

  @Prueba @CP02
  Scenario: Ingresar al cms y validar la funcionalidad add new del modulo post
    Given inicio sesion en el cms con una cuenta con <usuario> y <clave>
    When ingreso al modulo post y acciono el boton add new
    Then valido que cargue correctamente la plantilla del post para modificar
    And modifico el titulo del post
    And agrego un bloque y lo modifico
    And guardo el borrador y realizo una vista previa de la pagina
    And valido que los titulos esten bien



