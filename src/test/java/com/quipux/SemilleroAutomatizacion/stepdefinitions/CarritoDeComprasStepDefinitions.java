package com.quipux.SemilleroAutomatizacion.stepdefinitions;

import com.quipux.SemilleroAutomatizacion.interactions.TiempoDeEspera;
import com.quipux.SemilleroAutomatizacion.tasks.VerificarArticulo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.SemilleroAutomatizacion.usertinterface.ArticuloPage.BTN_ANADIR_CARRITO;
import static com.quipux.SemilleroAutomatizacion.usertinterface.HomeMyShopifyPage.A_PRODUCTO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarritoDeComprasStepDefinitions {
    @Dado("que me encuentro en la informacion del primero articulo")
    public void queMeEncuentroEnLaInformacionDelPrimeroArticulo() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(A_PRODUCTO)
        );
    }
    @Cuando("le doy click al boton de agregar al carrito")
    public void leDoyClickAlBotonDeAgregarAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
               Click.on(BTN_ANADIR_CARRITO),
                TiempoDeEspera.enLaPagina(3000)
        );

    }
    @Entonces("El articulo debe de estar en el carrito")
    public void elArticuloDebeDeEstarEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(
                VerificarArticulo.enelCarrito()
        );
    }
}
