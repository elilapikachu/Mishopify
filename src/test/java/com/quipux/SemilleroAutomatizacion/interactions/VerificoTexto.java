package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ResultadosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificoTexto{
    public static Performable visibleEnLaPagina(String mensaje, Target texto){
        return Task.where("{0} verifica que el texto sea visible",
                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(texto.of(mensaje), isVisible()),
                            Ensure.that(texto.of(mensaje)).isDisplayed()
                    );
                }

        );
    }
}
