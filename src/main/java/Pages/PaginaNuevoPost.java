package Pages;

import Helpers.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Driver.MyWebDriver.driver;

public class PaginaNuevoPost {


    //Atributos de la clase PaginaPost
    Helpers objHelpers = new Helpers();
    String parrafoPrueba = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sollicitudin lacus a tempus dapibus. Donec aliquam ac magna ac placerat. Nulla mollis tincidunt tortor, ac varius elit vulputate id. Etiam facilisis, ex id semper aliquam, libero tellus tristique tortor, vel interdum nulla mi vel sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vivamus pellentesque tellus in ante euismod, nec pellentesque ex condimentum. Ut feugiat vehicula semper. Interdum et malesuada fames ac ante ipsum primis in faucibus.";
    String tituloPrueba = "Nuevo titulo para el post de prueba automatizada con Selenium";

    //Lista de xpath que identifica los elementos de la página NuevoPost
    @FindBy(xpath = "//*[@id=\"editor\"]/div/div/div/div[1]/div[1]/div[1]/div/button")
    WebElement buttonAddBlock;
    @FindBy(xpath = "//*[@id=\"post-title-0\"]")
    WebElement textareaTitulo;
    @FindBy(xpath = "//*[@id=\"editor\"]/div/div/div/div[5]/div/div/div/div/div/div/div[1]/ul/li[1]/button")
    WebElement buttonBloqueNuevoParrafo;
    @FindBy(xpath = "//a[@class=\"components-button editor-post-preview is-button is-default is-large\"]")
    WebElement buttonVerPrevio;


    //Método constructor de la clase PaginaNuevoPost
    public PaginaNuevoPost() {
        PageFactory.initElements(driver, this);
    }

    //Lista de métodos que se ejecutan en la página NuevoPost

    public void hacerClickButtonAddBlock() {
        objHelpers.esperarCarga(2);
        buttonAddBlock.click();
        System.out.println("Click en el boton de nuevo bloque");
    }

    public void validarTextareaTitulo() {
        System.out.println("Validacion de la plantilla:\n");
        objHelpers.esperarCarga(2);
        if (textareaTitulo.isDisplayed()) {
            System.out.println("Campo para el titulo encontrado");
        } else {
            System.out.println("Campo para el titulo no encontrado");
        }
    }

    public void modificarTextareaTitulo() {
        objHelpers.esperarCarga(2);
        textareaTitulo.sendKeys(tituloPrueba);
        System.out.println("Se modifico el texto del titulo correctamente");
    }

    public void hacerClickButtonBloqueNuevoParrafo() {
        objHelpers.esperarCarga(2);
        buttonBloqueNuevoParrafo.click();
        System.out.println("Click en el boton de agregar nuevo bloque tipo parrafo");
    }

    public void modificarTextareaParrafo() {
        objHelpers.esperarCarga(2);
        try {
            WebElement textAreaParrafo = driver.findElement(By.xpath("//p[@role=\"textbox\"]"));
            if (textAreaParrafo.isDisplayed()) {
                System.out.println("Campo para el parrafo encontrado");
            } else {
                System.out.println("Campo para el parrafo no encontrado");
            }
            textAreaParrafo.sendKeys(parrafoPrueba);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se encontró el elemento web: " + e);
        }

    }

    public void validarExistenciaModalInformativo() {
        objHelpers.esperarCarga(2);
        try {
            WebElement mensajeVentanaModal = driver.findElement(By.xpath("//*[@class=\"components-popover__content\"]"));
            if (mensajeVentanaModal.isDisplayed()) {
                System.out.println("Ventana modal activa.\nCerrando ventana modal.");
                WebElement buttonCerrarVentanaModal = driver.findElement(By.xpath("//*[@class=\"components-popover__content\"]/button"));
                buttonCerrarVentanaModal.click();
            } else {
                System.out.println("Ventana modal inactiva");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se encontró el elemento web: " + e);
        }
    }

    public void hacerClickButtonSaveDraft() {
        objHelpers.esperarCarga(2);
        try {
            WebElement buttonSaveDraft = driver.findElement(By.xpath("//*[@class=\"edit-post-header__settings\"]/button[@shortcut=\"Ctrl+S\"]"));
            if (buttonSaveDraft.isDisplayed()) {
                System.out.println("Guardando borrador");
                buttonSaveDraft.click();
            } else {
                System.out.println("Botón de guardar borrador inactivo");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se encontró el elemento web: " + e);
        }
    }

    public void buttonVerPrevio() {
        objHelpers.esperarCarga(2);
        buttonVerPrevio.click();
        System.out.println("Click en el boton de Preview");
    }
}
