package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeMyShopifyPage {

    public final static Target OPTION_REGISTRO = Target.the("Opcion para poder ingresar al formulario de registro")
            .located(By.id("customer_register_link"));

    public final static Target INPUT_BUSCADOR = Target.the("Input para realizar busquedas de prendas de ropa")
            .locatedBy("// input[@id='search-field']");

    public final static Target A_PRODUCTO = Target.the("a que lleva a la información del primer producto")
            .located(By.id("product-1"));

    public final static Target A_CARRITO = Target.the("a que lleva a la información del primer producto")
            .locatedBy("//a[contains(normalize-space(), 'My Cart') and contains(@class, 'cart desktop')]");



}
