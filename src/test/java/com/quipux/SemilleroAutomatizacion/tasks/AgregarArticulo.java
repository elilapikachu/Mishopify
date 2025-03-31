package com.quipux.SemilleroAutomatizacion.tasks;

import com.quipux.SemilleroAutomatizacion.interactions.RecargarPagina;
import com.quipux.SemilleroAutomatizacion.interactions.TiempoDeEspera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ArticuloPage.BTN_ANADIR_CARRITO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.ArticuloPage.FILA_ARTICULO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.A_CARRITO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.A_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarArticulo {
    public static Performable alCarritoDeCompras(){
        return Task.where("{0} agrega un articulo al carrito de compra",
                actor -> {

                    actor.attemptsTo(
                            Click.on(A_PRODUCTO),
                            Click.on(BTN_ANADIR_CARRITO),
                            TiempoDeEspera.enLaPagina(3000)

                    );
                }

        );
    }
}
