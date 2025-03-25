package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ArticuloPage {
    public final static Target BTN_ANADIR_CARRITO = Target.the("Boton para añadir el articulo al carrito")
            .located(By.id("add"));

}
