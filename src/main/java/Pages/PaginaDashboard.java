package Pages;

import Helpers.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Driver.MyWebDriver.driver;

public class PaginaDashboard {

    //Atributos de la clase PaginaDashboard
    Helpers objHelpers = new Helpers();

    //Método constructor de la clase
    public PaginaDashboard() {
        PageFactory.initElements(driver, this);
    }

    //Lista de xpath que identifica los elementos de la página Dashboard
    @FindBy(xpath = "//*[@id=\"menu-posts\"]/a/div[2]")
    WebElement buttonModuloPost;
    @FindBy(xpath = "//*[@id=\"menu-pages\"]/a/div[2]")
    WebElement buttonModuloPages;


    //Lista de métodos que se ejecutan en la página Dashboard
    public void hacerClickButtonModuloPost() {
        objHelpers.esperarCarga(2);
        buttonModuloPost.click();
        System.out.println("Ingreso al modulo Post");
    }

    public void hacerClickButtonModuloPages() {
        objHelpers.esperarCarga(2);
        buttonModuloPages.click();
        System.out.println("Ingreso al modulo Pages");
    }
}
