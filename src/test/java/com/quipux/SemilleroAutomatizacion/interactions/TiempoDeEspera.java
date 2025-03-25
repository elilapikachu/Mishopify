package com.quipux.SemilleroAutomatizacion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class TiempoDeEspera {
    public static Performable enLaPagina(Integer segundos){
        return Task.where("{0} espera el tiempo indicado",
                actor -> {
                    try {
                        Thread.sleep(segundos);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                }

        );
    }
}
