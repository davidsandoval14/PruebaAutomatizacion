package Pages;

import Helpers.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import static Driver.MyWebDriver.driver;

public class PaginaVistaPrevia {

    //Atributos de la clase PaginaVistaPrevia
    PaginaNuevoPost objPaginaNuevoPost = new PaginaNuevoPost();
    Helpers objHelpers = new Helpers();

    //Lista de xpath que identifica los elementos de la página VistaPrevia
    @FindBy(xpath = "//div[@class=\"entry-content\"]/p")
    WebElement parrafoVentanaPrevia;
    @FindBy(xpath = "//h1[@class=\"entry-title\"]")
    WebElement tituloVentanaPrevia;


    //Método constructor de la clase PaginaVistaPrevia
    public PaginaVistaPrevia() {
        PageFactory.initElements(driver, this);
    }

    //Lista de métodos que se ejecutan en la página VistaPrevia
    public void validarTituloVentanaPrevia() {
        objHelpers.esperarCarga(7);

        //Selecciona la última ventana activa en el explorador Chrome
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //Valida que los textos sean iguales del titulo
        Assert.assertEquals(objPaginaNuevoPost.tituloPrueba, tituloVentanaPrevia.getText());
        System.out.println("Titulo en ventana de vista previa correctamente validado");
    }

    public void validarParrafoVentanaPrevia() {
        objHelpers.esperarCarga(2);
        //Valida que los textos sean iguales del parrafo
        Assert.assertEquals(objPaginaNuevoPost.parrafoPrueba, parrafoVentanaPrevia.getText());
        System.out.println("Parrafo en ventana de vista previa correctamente validado");
    }

}
