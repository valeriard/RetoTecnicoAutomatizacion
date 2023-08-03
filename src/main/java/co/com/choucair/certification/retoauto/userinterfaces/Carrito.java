package co.com.choucair.certification.retoauto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito {
    public static final Target boton_carrito = Target.the("Boton ir al carrito")
            .located(By.xpath("//a[contains(@class,'exito-header-3-x-minicartLink')]"));
    public static final Target boton_correo = Target.the("Boton ir al carrito")
            .located(By.xpath("(//input[contains(@data-atom-text-field,'true')])[2]"));
    public static final Target confirmar_correo =Target.the("Boton Confirmar")
            .located(By.xpath("//button[@class='exito-checkout-io-0-x-preLoginActiveButton'][contains(.,'Confirmar')]"));
    public static final Target nombre_productoUno=Target.the("nombre del producto")
            .located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'AGUILA')]"));


}
