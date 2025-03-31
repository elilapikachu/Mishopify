package com.quipux.SemilleroAutomatizacion.tasks;

import com.quipux.SemilleroAutomatizacion.interactions.TiempoDeEspera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ArticuloPage.BTN_ANADIR_CARRITO;

public class DarClickAlBoton {
    public static Performable paraAgregarArticulo(){
        return Task.where("{0} agrega al carrito el producto",
                actor -> {

                    actor.attemptsTo(

                            Click.on(BTN_ANADIR_CARRITO),
                            TiempoDeEspera.enLaPagina(3000)
                    );
                }

        );
    }
}
