package com.quipux.SemilleroAutomatizacion.usertinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosPage {
    public final static Target RESULTADOS_BUSQUEDA = Target.the("Resultados de la busqueda")
            .locatedBy("//a[@class='animated fadeInUpBig']");

    public final static Target TEXTO_BUSQUEDA= Target.the("Resultados de la busqueda")
            .locatedBy("//a[@class='animated fadeInUpBig']//h3[contains(text(), '{0}')]");

    public final static Target TEXTO_NO_RESULTADO= Target.the("Texto que le avisa al usuario que no se encontraron resultados")
            .locatedBy("//div[contains(normalize-space(), '{0}') and @id='keyword']");
}
