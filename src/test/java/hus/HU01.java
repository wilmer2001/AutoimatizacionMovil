package hus;

import io.cucumber.java.en.*;
import pages.Validaciones;
public class HU01 {

    Validaciones Login = new Validaciones();
    @Given("Ingresar al aplicativo de Forms")
    public void ingresar_al_aplicativo_de_forms() {
Login.Ingreso();
    }
    @When("Dar clic en crear Formulario")
    public void dar_clic_en_crear_formulario() {
     Login.DarClic();
    }
    @And("Seleccionar el tipo de Formulario a Diligenciar")
    public void seleccionar_el_tipo_de_formulario_a_diligenciar() {
Login.Formulario1();
    }
    @Then("Validar el ingreso al aplicativo")
    public void validar_el_ingreso_al_aplicativo() {

    }
}
