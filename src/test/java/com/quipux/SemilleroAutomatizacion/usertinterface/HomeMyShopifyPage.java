package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeMyShopifyPage {

    public final static Target OPTION_REGISTRO = Target.the("Opcion para poder ingresar al formulario de registro")
            .located(By.id("customer_register_link"));

    public final static Target INPUT_BUSCADOR = Target.the("Input para realizar busquedas de prendas de ropa")
            .locatedBy("// input[@id='search-field']");



}
