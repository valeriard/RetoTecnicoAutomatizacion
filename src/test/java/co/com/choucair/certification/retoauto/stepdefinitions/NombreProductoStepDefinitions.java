package co.com.choucair.certification.retoauto.stepdefinitions;

import co.com.choucair.certification.retoauto.models.Data;
import co.com.choucair.certification.retoauto.tasks.AbrirPagina;
import co.com.choucair.certification.retoauto.tasks.AgregarProductos;
import co.com.choucair.certification.retoauto.tasks.Categoria;
import co.com.choucair.certification.retoauto.tasks.SubCategoria;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


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
        OnStage.theActorInTheSpotlight().attemptsTo(Categoria.mercado());
    }

    @Cuando("luego selecciono una subcategoria")
    public void luegoSeleccionoUnaSubcategoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(SubCategoria.cervezas());
    }

    @Cuando("agrego cinco productos con distintas cantidades al carrito")
    public void agregoCincoProductosConDistintasCantidadesAlCarrito(List<Data> dataProductos) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alcarrito(dataProductos.get(0)));
    }

    @Cuando("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {

    }

    @Entonces("verifico el nombre de los productos agregados debera ser igual que en el carrito")
    public void verificoElNombreDeLosProductosAgregadosDeberaSerIgualQueEnElCarrito() {

    }

}
