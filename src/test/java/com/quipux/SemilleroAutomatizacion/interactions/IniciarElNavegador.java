package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class IniciarElNavegador {

    public static Performable yNavegarALaPaginaEspecificada() {
        return Task.where("{0} inicia el navegador y navega a la pagina",
                actor -> {
                    actor.attemptsTo(Open.url("https://www.quipux.com/web/"));
                }
        );
    }

}
