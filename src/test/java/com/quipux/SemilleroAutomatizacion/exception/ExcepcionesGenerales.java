package com.quipux.SemilleroAutomatizacion.exception;

public class ExcepcionesGenerales extends RuntimeException {
    public ExcepcionesGenerales(String message) {
        super(message);
    }

    public static ExcepcionesGenerales MensajeNoVisible() {
        return new ExcepcionesGenerales("No se visualiza el mensaje de bienvenido en la pagina principal");
    }
}

