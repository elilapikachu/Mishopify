package com.quipux.SemilleroAutomatizacion.stepdefinitions;

import com.quipux.SemilleroAutomatizacion.tasks.DarEnter;
import com.quipux.SemilleroAutomatizacion.tasks.IngresarElementoABuscar;
import com.quipux.SemilleroAutomatizacion.tasks.VerificoResultado;
import com.quipux.SemilleroAutomatizacion.tasks.VerificoTexto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {

    @Dado("que ingreso la palabra '{}' en el buscador de la pagina Home")
    public void queIngresoLaPalabraEnElBuscadorDeLaPaginaHome(String busqueda) {
        theActorInTheSpotlight().attemptsTo(
                IngresarElementoABuscar.enLaPaginaDeHome(busqueda)
        );
    }
    @Cuando("realizo la busqueda")
    public void realizoLaBusqueda() {
        theActorInTheSpotlight().attemptsTo(
                DarEnter.enELbuscador()
        );
    }

    @Entonces("deben aparecer uno o varios resultados y verifico que el resultado contenga la palabra '{}' en el")
    public void debenAparecerUnoOVariosResultadosYVerificoQueElResultadoContengaLaPalabraEnEl(String busqueda) {
        theActorInTheSpotlight().attemptsTo(
                VerificoResultado.deLaBusqueda(busqueda)
        );
    }

    @Entonces("deben aparecer el mensaje '{}' indicando que no se encontro el resultado deseado")
    public void debenAparecerElMensajeNoResultsFoundForIndicandoQueNoSeEncontroElResultadoDeseado(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                VerificoTexto.deLaBusqueda(mensaje)
        );
    }
}
