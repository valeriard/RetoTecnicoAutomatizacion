package co.com.choucair.certification.retoauto.stepdefinitions;


import co.com.choucair.certification.retoauto.models.Data;
//import co.com.choucair.certification.retoauto.questions.NombreProductos;
import co.com.choucair.certification.retoauto.questions.NombreProductos;
import co.com.choucair.certification.retoauto.tasks.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.retoauto.utils.Constantes.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class NombreProductoStepDefinitions {

    @Before
    public void initialConfiguration(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^que estoy en la pagina del exito$")
    public void queEstoyEnLaPaginaDelExito() {
        theActorCalled(ACTOR).wasAbleTo(AbrirPagina.exito());
    }

    @Cuando("^elijo una categoria$")
    public void elijoUnaCategoria() {
        theActorInTheSpotlight().attemptsTo( Categoria.mercado());
    }

    @Cuando("^luego selecciono una subcategoria$")
    public void luegoSeleccionoUnaSubcategoria() {
        theActorInTheSpotlight().attemptsTo( SubCategoria.cervezas());
    }

    @Cuando("^agrego cinco productos con distintas cantidades al carrito$")
    public void agregoCincoProductosConDistintasCantidadesAlCarrito(DataTable datos) {
        List<Map<String,String>> datosPagina = datos.asMaps();
        theActorInTheSpotlight().attemptsTo( AgregarProductos.alcarrito(datosPagina));
    }

    @Cuando("ingreso al carrito de compras e ingreso un correo")
    public void ingresoAlCarritoDeComprasEIngresoUnCorreo() {
    theActorInTheSpotlight().attemptsTo(IngresarAlCarrito.deCompras());
    }

    @Entonces("^verifico el nombre de los productos agregados debera ser igual que en el carrito$")
    public void verificoElNombreDeLosProductosAgregadosDeberaSerIgualQueEnElCarrito(DataTable datos) {
        List<Map<String,String>> datosPagina = datos.asMaps();
       theActorInTheSpotlight().should(seeThat(NombreProductos.es(datosPagina)));

    }
    @Entonces("el total de los precios de los productos agregados debera ser igual que en el carrito")
    public void elTotalDeLosPreciosDeLosProductosAgregadosDeberaSerIgualQueEnElCarrito() {

    }
    @Entonces("las cantidades de los productos agregados debera ser igual que en el carrito")
    public void lasCantidadesDeLosProductosAgregadosDeberaSerIgualQueEnElCarrito() {

    }
    @Entonces("el numero de productos agregados debe ser igual que en el carrito")
    public void elNumeroDeProductosAgregadosDebeSerIgualQueEnElCarrito() {

    }



}