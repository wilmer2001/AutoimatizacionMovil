package hus;

import io.cucumber.java.en.*;
import pages.Validaciones;

public class IngresoDatos {

    Validaciones Login = new Validaciones();
    @Given("Ingresar a la aplicacion de Forms")
    public void ingresar_a_la_aplicacion_de_forms() {
        Login.abrirApp();
        Login.Ingreso();
    }

    @When("Dar clic en Formulario de Contacto")
    public void dar_clic_en_formulario_de_contacto() {
        Login.DarClic();
        Login.Formulario1();
    }

    @When("Ingresar el titulo")
    public void ingresar_el_titulo() {
        Login.IngresoTitulo();
    }

    @When("Ingresar Descripcion")
    public void ingresar_descripcion() {
        Login.IngresoDescripcion();
    }

    @Then("Validar el Ingreso de los datos en Titulo y Descripcion")
    public void validar_el_ingreso_de_los_datos_en_titulo_y_descripcion() {
        Login.closedApp();
    }
}
