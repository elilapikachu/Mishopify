package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ArticuloPage {
    public final static Target BTN_ANADIR_CARRITO = Target.the("Boton para añadir el articulo al carrito")
            .located(By.id("add"));

    public final static Target FILA_ARTICULO = Target.the("Fila que muestra la información sobre el articulo en el carrito")
            .locatedBy("//div[@class='row first']");

    public final static Target REMOVER_ARTICULO = Target.the("A para remover el articulo del carro de compras")
            .locatedBy("//a[@class='removeLine']");

}
