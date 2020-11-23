package Pages;

import Helpers.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Driver.MyWebDriver.driver;

public class PaginaInicioSesion {

    //Atributos de la clase PaginaInicioSesion
    Helpers objHelpers = new Helpers();
    //Lista de xpath que identifica los elementos de la página de inicio de sesión
    @FindBy(xpath = "//*[@id=\"user_login\"]")
    WebElement inputNombreUsuario;
    @FindBy(xpath = "//*[@id=\"user_pass\"]")
    WebElement inputClave;
    @FindBy(xpath = "//*[@id=\"wp-submit\"]")
    WebElement buttonLogIn;

    //Método constructor de la clase
    public PaginaInicioSesion() {
        PageFactory.initElements(driver, this);
    }

    //Lista de métodos que se ejecutan en la página para iniciar sesión
    public void ingresarNombreUsuario() {
        objHelpers.esperarCarga(2);
        inputNombreUsuario.sendKeys("opensourcecms");
        System.out.println("Se digito el usuario");
    }

    public void ingresarClave() {
        objHelpers.esperarCarga(2);
        inputClave.sendKeys("opensourcecms");
        System.out.println("Se digito la clave");
    }

    public void hacerClickButtonLogin() {
        objHelpers.esperarCarga(2);
        buttonLogIn.click();
        System.out.println("Inicio de sesión exitoso");
    }


}
