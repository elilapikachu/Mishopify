package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.INPUT_BUSCADOR;


public class DarEnter {
    public static Performable enElElemento(Target elemento){
        return Task.where("{0} Da enter para continuar",
                actor -> {
                    actor.attemptsTo(
                            Hit.the(Keys.ENTER).into(elemento)
                    );
                }
                );
    }
}
