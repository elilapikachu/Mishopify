package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.INPUT_BUSCADOR;

public class IngresarElementoABuscar {
    public static Performable enLaPaginaDeHome(String busqueda){
return Task.where("{0} Ingresa el dato a buscar en la pagina Home del portal",

        actor -> {
            actor.attemptsTo(
                    SendKeys.of(busqueda).into(INPUT_BUSCADOR)
            );
        }
        );
    }
}
