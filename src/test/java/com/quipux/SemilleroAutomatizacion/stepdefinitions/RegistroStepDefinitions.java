package com.quipux.SemilleroAutomatizacion.stepdefinitions;

import com.quipux.SemilleroAutomatizacion.interactions.DarClick;
import com.quipux.SemilleroAutomatizacion.tasks.LlenarDatos;
import com.quipux.SemilleroAutomatizacion.tasks.VerifircarAparicionCapcha;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.OPTION_REGISTRO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Dado("que me encuentro en el formulario de registro")
    public void que_me_encuentro_en_el_formulario_de_registro() {
        theActorInTheSpotlight().attemptsTo(
                DarClick.aElElemento(OPTION_REGISTRO)
        );
    }

    @Cuando("lleno los datos {} {} {} y {} luego le doy al boton de registrar")
    public void llenoLosDatosYLuegoLeDoyAlBotonDeRegistrar(String nombre, String apellido, String correo, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                LlenarDatos.enElFormularioDeRegistro(nombre, apellido, correo, contrasena)
        );
    }


    @Entonces("debe de aparecer el capcha como medida de seguridad")
    public void debeDeAparecerElCapchaComoMedidaDeSeguridad() {
        theActorInTheSpotlight().attemptsTo(
            VerifircarAparicionCapcha.enElFormularioDeRegistro()
    );

    }
}
