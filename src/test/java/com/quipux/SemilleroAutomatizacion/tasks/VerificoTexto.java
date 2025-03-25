package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ResultadosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificoTexto{
    public static Performable deLaBusqueda(String mensaje){
        return Task.where("{0} verifica que el texto sea visible en la busqueda",
                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(TEXTO_NO_RESULTADO.of(mensaje), isVisible())
                    );
                }

        );
    }
}
