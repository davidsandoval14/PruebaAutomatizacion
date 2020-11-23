package Pages;

import Helpers.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Driver.MyWebDriver.driver;

public class PaginaPost {

    //Atributos de la clase PaginaPost
    Helpers objHelpers = new Helpers();

    //Método constructor de la clase PaginaPost
    public PaginaPost() {
        PageFactory.initElements(driver, this);
    }

    //Lista de xpath que identifica los elementos de la página Post
    @FindBy(xpath = "//*[@id=\"wpbody-content\"]/div[5]/a")
    WebElement buttonAddNew;


    //Lista de métodos que se ejecutan en la página Post
    public void hacerClickButtonModuloPost() {
        objHelpers.esperarCarga(5);
        buttonAddNew.click();
        System.out.println("Click en el boton del modulo Post");
    }
}
