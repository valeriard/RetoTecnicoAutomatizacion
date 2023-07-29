package co.com.choucair.certification.retoauto.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosTransversales {
    public static final Target menu = Target.the("Menu").located(By.id("Trazado_7822"));
    public static final Target categoria_mercado= Target.the("").located(By.id("undefined-nivel2-Mercado"));
    public static final Target categoria_tecnlogia= Target.the("").located(By.id("undefined-nivel2-Tecnología"));
    public static final Target subcategoria_mercado= Target.the("").located(By.id("Categorías-nivel3-Cervezas"));
    public static final Target subcategoria_tecnlogia= Target.the("").located(By.id("Categorías-nivel3-Computadores portátiles"));
    public static final Target boton_agregar = Target.the("Menu").located(By.xpath("(//span[@class='exito-vtex-components-4-x-buttonText'][contains(.,'Agregar')])[1]"));
}
