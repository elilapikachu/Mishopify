package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerificarElementoNoVisible {
    public static Performable enLaPagina(Target xpath) {
        return Task.where("{0} verifica que el elemento no es visible",
                actor -> {
                    WaitUntil.the(xpath, WebElementStateMatchers.isNotVisible());
                }
        );
    }
}
