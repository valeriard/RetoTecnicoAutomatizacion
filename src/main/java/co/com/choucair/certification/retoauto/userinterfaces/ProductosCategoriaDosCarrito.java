package co.com.choucair.certification.retoauto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosCategoriaDosCarrito {
    public static final Target pc_Uno = Target.the("Producto 1").located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'POKER')]"));
    public static final Target pc_Dos = Target.the("Producto 2").located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'COSTENA')]"));
    public static final Target pc_Tres = Target.the("Producto 3").located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'CLUB COLOMBIA')]"));
    public static final Target pc_Cuatro = Target.the("Producto 4").located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'CORONA')]"));
    public static final Target pc_Cinco = Target.the("Producto 5").located(By.xpath("//span[@data-molecule-product-detail-brand-name-span='true'][contains(.,'ANDINA')]"));

    public static final Target cantidadpc_Uno = Target.the("cantidad de producto 1").located(By.xpath("//span[@data-molecule-quantity-und-value='true'][contains(.,'2')]"));
    public static final Target cantidadpc_Dos = Target.the("cantidad de producto 2").located(By.xpath("//span[@data-molecule-quantity-und-value='true'][contains(.,'4')]"));
    public static final Target cantidadpc_Tres = Target.the("cantidad de producto 3").located(By.xpath("//span[@data-molecule-quantity-und-value='true'][contains(.,'2')]"));
    public static final Target cantidadpc_Cuatro = Target.the("cantidad de producto 4").located(By.xpath("//span[@data-molecule-quantity-und-value='true'][contains(.,'3')]"));
    public static final Target cantidadpc_Cinco = Target.the("cantidad de producto 5").located(By.xpath("//span[@data-molecule-quantity-und-value='true'][contains(.,'2')]"));
}
