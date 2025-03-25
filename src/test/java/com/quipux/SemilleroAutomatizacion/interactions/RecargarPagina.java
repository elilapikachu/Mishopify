package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.core.Serenity.getDriver;

public class RecargarPagina {

    public static Performable paraPoderSeguirNavegando() {
        return Task.where("{0} recarga la página y espera 5 segundos",
                actor -> {
                    getDriver().navigate().refresh();

                }
        );
    }
}