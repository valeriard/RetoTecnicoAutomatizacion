package co.com.choucair.certification.retoauto.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosTransversales {
    public static final Target menu = Target.the("Menu").located(By.id("Trazado_7822"));
    public static final Target categoria= Target.the("Categoria Mercado").located(By.xpath("//li[@class='exito-category-menu-3-x-itemCategory '][contains(.,'Mercado')]"));
    public static final Target subcategoria= Target.the("Subcategoria cerveza").located(By.id("Categorías-nivel3-Cervezas"));
    //Modal como quieres recibir tu pedido
    public static final Target boton_ciudad = Target.the("Boton Ciudad")
            .located(By.xpath("(//div[@class='css-yiuvdt'][contains(.,'Seleccionar')])[1]"));
    public static final Target seleccionar_ciudad =Target.the("seleccionar ciudad")
            .located(By.xpath("//*[@id='react-select-2-option-2']/div"));
    public static final Target boton_almacen = Target.the("Boton Almacen").located(By.xpath("//div[@class='pa0 min-h-regular'][contains(.,'Seleccionar')]"));
    public static final Target seleccionar_almacen =Target.the("seleccionar almacen")
            .located(By.xpath("//*[@id='react-select-4-option-0']/div"));
    public static final Target boton_confirmar = Target.the("Boton confirmar").located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButtonEnable'][contains(.,'Confirmar')]"));


}
