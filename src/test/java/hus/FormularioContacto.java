package hus;

import io.cucumber.java.en.*;
import pages.Validaciones;

public class FormularioContacto {

    Validaciones Login = new Validaciones();

    @Given("Ingresar al aplicativo de Forms")
    public void ingresar_al_aplicativo_de_forms() {
        Login.abrirApp();
        Login.Ingreso();
    }

    @When("Dar clic en crear Formulario")
    public void dar_clic_en_crear_formulario() {
        Login.DarClic();
    }

    @And("Seleccionar el tipo de Formulario a Diligenciar")
    public void seleccionar_el_tipo_de_formulario_a_diligenciar() {
        Login.Formulario1();
        Login.Titulo();
    }

    @Then("Validar el ingreso al formulario de contacto")
    public void validar_el_ingreso_al_formulario_de_contacto() {
        Login.closedApp();
    }

}
