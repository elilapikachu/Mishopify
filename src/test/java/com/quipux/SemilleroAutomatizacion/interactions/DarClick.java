package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DarClick {
    public static Performable aElElemento(Target elemento){
        return Task.where("{0} da click al elemento",

                actor -> {
                    actor.attemptsTo(
                            Click.on(elemento)
                    );
                }
        );
    }
}
