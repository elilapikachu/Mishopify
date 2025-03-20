package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.INPUT_BUSCADOR;


public class DarEnter {
    public static Performable enELbuscador(){
        return Task.where("{0} Da enter para poder realizar la busqueda",
                actor -> {
                    actor.attemptsTo(
                            Hit.the(Keys.ENTER).into(INPUT_BUSCADOR)
                    );
                }
                );
    }
}
