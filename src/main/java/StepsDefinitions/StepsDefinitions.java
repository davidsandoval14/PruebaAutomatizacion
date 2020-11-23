package StepsDefinitions;

import Steps.ControllerSteps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static Driver.MyWebDriver.close;
import static Driver.MyWebDriver.runDriver;

public class StepsDefinitions {

    @Steps
    ControllerSteps objControllerSteps;

    @Before
    public void antesDelTest() {
        runDriver("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
    }

    @After
    public void despuesDelTest() {
        close();
    }

    @Given("^inicio sesion en el cms con una cuenta con <usuario> y <clave>$")
    public void inicioSesionEnElCmsConUnaCuentaConUsuarioYClave() {
        objControllerSteps.iniciarSesion();
    }

    @When("^ingreso al modulo post y acciono el boton add new$")
    public void ingresoAlModuloPostYAccionoElBotonAddNew() {
        objControllerSteps.ingresarModuloPost();
        //objControllerSteps.ingresarModuloPages();
        objControllerSteps.ingresarModuloPostOpcionAddNew();

    }

    @Then("^valido que cargue correctamente la plantilla del post para modificar$")
    public void validoQueCargaCorrectamenteLaPlantillaDelPostParaModificar() {
        objControllerSteps.validarPlantillaNuevoPost();
    }

    @And("^modifico el titulo del post$")
    public void modificoElTituloDelPost() {
        objControllerSteps.modificarBloqueTitulo();
    }

    @And("^agrego un bloque y lo modifico$")
    public void agregoUnBloqueYLoModifico() {
        objControllerSteps.agregarBloqueNuevoParrafo();
        objControllerSteps.modificarBloqueParrafo();
    }

    @And("^guardo el borrador y realizo una vista previa de la pagina$")
    public void guardoElBorradorYRealizoUnaVistaPreviaDeLaPagina() {
        objControllerSteps.guardarPostModificado();
        objControllerSteps.realizarVistaPrevia();
    }

    @And("^valido que los titulos esten bien$")
    public void validoQueLosTitulosEstenBien() {
        objControllerSteps.validarInformacionPaginaVistaPrevia();
    }
}
