package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FormularioRegistroPage {
    public final static Target INPUT_NOMBRE = Target.the("Input para ingresar el nombre")
            .locatedBy("//input[@id='first_name']");

    public final static Target INPUT_APELLIDO = Target.the("Input para ingresar el apellido")
            .locatedBy("//input[@id='last_name']");

    public final static Target INPUT_CORREO = Target.the("Input para ingresar el correo")
            .locatedBy("//input[@id='email']");

    public final static Target INPUT_CONTRASENA = Target.the("Input para ingresar la contraseña")
            .locatedBy("//input[@id='password']");

    public final static Target BTN_SUBMIT = Target.the("Boton para hacer registrase")
            .locatedBy("//input[@value='Create']");
}
