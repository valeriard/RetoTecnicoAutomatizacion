package co.com.choucair.certification.retoauto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cervezas {
    //Botones de agregar en diferentes posiciones
    public static final Target boton_agregar_1 = Target.the("Botón Agregar 1")
            .located(By.xpath("(//button[@tabindex='0'][contains(.,'Agregar')])[1]"));


    //Botones Cantidades
    public static final Target botonCantidadUno = Target.the("Botón agregar unidades de producto uno")
            .located(By.xpath("(//button[contains(@class,'exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus')])[1]"));


}
