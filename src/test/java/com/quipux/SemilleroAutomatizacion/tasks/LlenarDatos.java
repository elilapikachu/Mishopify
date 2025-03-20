package com.quipux.SemilleroAutomatizacion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.quipux.SemilleroAutomatizacion.usertinterface.FormularioRegistroPage.*;

public class LlenarDatos {
    public static Performable enElFormularioDeRegistro(String nombre, String apellido, String correo, String contrasena){
        return Task.where("{0} ingresa al formulario de registro",

                actor -> {
                    actor.attemptsTo(
                            SendKeys.of(nombre).into(INPUT_NOMBRE),
                            SendKeys.of(apellido).into(INPUT_APELLIDO),
                            SendKeys.of(correo).into(INPUT_CORREO),
                            SendKeys.of(contrasena).into(INPUT_CONTRASENA),
                            Click.on(BTN_SUBMIT)
                    );
                }
        );
    }
}
