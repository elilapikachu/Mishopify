package com.quipux.SemilleroAutomatizacion.usertinterface;

import io.cucumber.core.backend.Located;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeMyShopifyPage {

    public final static Target OPTION_REGISTRO = Target.the("Opcion para poder ingresar al formulario de registro")
            .located(By.id("customer_register_link"));



}
