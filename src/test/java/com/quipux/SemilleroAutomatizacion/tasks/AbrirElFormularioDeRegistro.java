package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.OPTION_REGISTRO;

public class AbrirElFormularioDeRegistro {
    public static Performable enLapaginaDeShopify(){
        return Task.where("{0} navega al formulario de registro",

                actor -> {
                    actor.attemptsTo(
                            Click.on(OPTION_REGISTRO)
                    );
                }
        );
    }
}
