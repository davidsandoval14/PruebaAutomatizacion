package Steps;

import Pages.*;
import net.thucydides.core.annotations.Step;

public class ControllerSteps {
    PaginaInicioSesion objPaginaInicioSesion;
    PaginaDashboard objPaginaDashboard;
    PaginaPost objPaginaPost;
    PaginaNuevoPost objPaginaNuevoPost;
    PaginaVistaPrevia objPaginaVistaPrevia;

    //Pasos de la prueba Choucair
    @Step
    public void iniciarSesion() {
        objPaginaInicioSesion = new PaginaInicioSesion();
        objPaginaInicioSesion.ingresarNombreUsuario();
        objPaginaInicioSesion.ingresarClave();
        objPaginaInicioSesion.hacerClickButtonLogin();
    }

    @Step
    public void ingresarModuloPost() {
        objPaginaDashboard = new PaginaDashboard();
        objPaginaDashboard.hacerClickButtonModuloPost();
    }

    @Step
    public void ingresarModuloPages() {
        objPaginaDashboard = new PaginaDashboard();
        objPaginaDashboard.hacerClickButtonModuloPages();
    }

    @Step
    public void ingresarModuloPostOpcionAddNew() {
        objPaginaPost = new PaginaPost();
        objPaginaPost.hacerClickButtonModuloPost();
    }

    @Step
    public void validarPlantillaNuevoPost() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.validarExistenciaModalInformativo();
        objPaginaNuevoPost.validarTextareaTitulo();
    }

    @Step
    public void modificarBloqueTitulo() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.modificarTextareaTitulo();
    }

    @Step
    public void agregarBloqueNuevoParrafo() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.hacerClickButtonAddBlock();
        objPaginaNuevoPost.hacerClickButtonBloqueNuevoParrafo();
    }

    @Step
    public void modificarBloqueParrafo() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.modificarTextareaParrafo();
    }

    @Step
    public void guardarPostModificado() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.hacerClickButtonSaveDraft();
    }

    @Step
    public void realizarVistaPrevia() {
        objPaginaNuevoPost = new PaginaNuevoPost();
        objPaginaNuevoPost.buttonVerPrevio();
    }

    @Step
    public void validarInformacionPaginaVistaPrevia() {
        objPaginaVistaPrevia = new PaginaVistaPrevia();
        objPaginaVistaPrevia.validarTituloVentanaPrevia();
        objPaginaVistaPrevia.validarParrafoVentanaPrevia();
    }

}
