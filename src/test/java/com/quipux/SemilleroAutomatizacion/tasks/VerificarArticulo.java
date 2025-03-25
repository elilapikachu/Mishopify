package com.quipux.SemilleroAutomatizacion.tasks;

import com.quipux.SemilleroAutomatizacion.interactions.RecargarPagina;
import com.quipux.SemilleroAutomatizacion.interactions.TiempoDeEspera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.A_CARRITO;

public class VerificarArticulo {
    public static Performable enelCarrito(){
        return Task.where("{0} verifica que su busqueda haya sido exitosa",
                actor -> {

                    actor.attemptsTo(
                            RecargarPagina.paraPoderSeguirNavegando(),
                            TiempoDeEspera.enLaPagina(2000),
                            Click.on(A_CARRITO)

                    );
                }

        );
    }

}
