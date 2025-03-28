package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ResultadosPage.RESULTADOS_BUSQUEDA;
import static com.quipux.SemilleroAutomatizacion.usertinterface.ResultadosPage.TEXTO_BUSQUEDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificoResultado {
    public static Performable deLaBusqueda(String busqueda){
        return Task.where("{0} verifica que su busqueda haya sido exitosa",
                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible()),
                            Ensure.that(TEXTO_BUSQUEDA.of(busqueda)).isDisplayed()

                    );
                }

                );
    }
}
