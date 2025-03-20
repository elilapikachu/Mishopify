package com.quipux.SemilleroAutomatizacion.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {
    @Dado("que ingreso la palabra '{}' en el buscador de la pagina Home")
    public void queIngresoLaPalabraEnElBuscadorDeLaPaginaHome(String string) {
        theActorInTheSpotlight().attemptsTo(

        );
    }
    @Cuando("realizo la busqueda")
    public void realizoLaBusqueda() {
        theActorInTheSpotlight().attemptsTo(

        );
    }
    @Entonces("deben aparecer uno o varios resultados y verifico que el resultado contenga la palabra Grey en el")
    public void debenAparecerUnoOVariosResultadosYVerificoQueElResultadoContengaLaPalabraGreyEnEl() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

}
