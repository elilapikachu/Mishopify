package com.quipux.SemilleroAutomatizacion.tasks;

import com.quipux.SemilleroAutomatizacion.interactions.RecargarPagina;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ArticuloPage.REMOVER_ARTICULO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.A_CARRITO;

public class EliminarArticulo {
    public static Performable enElCarrito(){
        return Task.where("{0} Entra al carrito y elimina el articulo",
                actor -> {

                    actor.attemptsTo(
                            RecargarPagina.paraPoderSeguirNavegando(),
                            Click.on(A_CARRITO),
                            Click.on(REMOVER_ARTICULO)


                    );
                }

        );
    }
}
