package co.com.choucair.certification.retoauto.stepdefinitions;

import co.com.choucair.certification.retoauto.tasks.AbrirPagina;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class NombreProductoStepDefinitions {
    @Before
    public void initialConfiguration(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que estoy en la pagina del exito")
    public void queEstoyEnLaPaginaDelExito() {
        OnStage.theActorCalled("").wasAbleTo(AbrirPagina.exito());
    }

    @Cuando("elijo una categoria")
    public void elijoUnaCategoria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("luego selecciono una subcategoria")
    public void luegoSeleccionoUnaSubcategoria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("agrego cinco productos con distintas cantidades al carrito")
    public void agregoCincoProductosConDistintasCantidadesAlCarrito(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("verifico el nombre de los productos agregados debera ser igual que en el carrito")
    public void verificoElNombreDeLosProductosAgregadosDeberaSerIgualQueEnElCarrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
