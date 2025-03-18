package com.quipux.SemilleroAutomatizacion.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Dado("que me encuentro en el formulario de registro")
    public void que_me_encuentro_en_el_formulario_de_registro() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

    @Cuando("lleno los datos {} {} {} y {} luego le doy al boton de registrar")
    public void llenoLosDatosYLuegoLeDoyAlBotonDeRegistrar(String nombre, String apellido, String correo, String contrasena) {
        theActorInTheSpotlight().attemptsTo(

        );
    }

    @Entonces("debo de estar registrado y lo confirmo viendo la seccion de {string}")
    public void debo_de_estar_registrado_y_lo_confirmo_viendo_la_seccion_de(String string) {
        theActorInTheSpotlight().attemptsTo(

        );
    }


}
