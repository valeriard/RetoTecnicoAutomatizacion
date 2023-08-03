package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.models.Data;
import co.com.choucair.certification.retoauto.utils.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.retoauto.userinterfaces.Cervezas.*;
import static co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales.*;

public class AgregarProductos implements Task {
    private List<Map<String,String>> cantidades;

    public AgregarProductos(List<Map<String, String>> cantidades) {
        this.cantidades = cantidades;
    }

    TiempoEspera tiempoEspera = new TiempoEspera();

    public static AgregarProductos alcarrito(List<Map<String, String>> cantidades) {
        return Tasks.instrumented(AgregarProductos.class, cantidades);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(boton_ciudad, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(boton_ciudad),
                Click.on(seleccionar_ciudad),
                Click.on(boton_almacen),
                Click.on(seleccionar_almacen),
                Click.on(boton_confirmar)
        );
        tiempoEspera.EsperarPor(5000);
        actor.attemptsTo(
                WaitUntil.the(boton_agregar_1,WebElementStateMatchers.isVisible()),
                Click.on(boton_agregar_1));
        tiempoEspera.EsperarPor(2000);
        for (int i= 1; i<Integer.parseInt(cantidades.get(0).get("cantidadProductoUno")); i++) {
            actor.attemptsTo(
                    WaitUntil.the(botonCantidadUno,WebElementStateMatchers.isVisible()),
                    Click.on(botonCantidadUno));
        }
        tiempoEspera.EsperarPor(6000);


    }

}
