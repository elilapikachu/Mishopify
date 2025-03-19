package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioRegistroPage.IFRAME_CAPCHA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class VerifircarAparicionCapcha {
    public static Performable enElFormularioDeRegistro(){
        return Task.where("{0} verifica que al darle click al boton de submit aparezca el capcha",

                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(IFRAME_CAPCHA, isVisible()).forNoMoreThan(5).seconds(),
                            Ensure.that(IFRAME_CAPCHA).isDisplayed()
                    );
                }
        );
    }
}
