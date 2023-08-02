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

import static co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales.*;

public class AgregarProductos implements Task {
    Data datosModoEntrega;
    TiempoEspera tiempoEspera = new TiempoEspera();

    public static AgregarProductos alcarrito(List<Map<String, String>> datosModoEntrega) {
        return Tasks.instrumented(AgregarProductos.class, datosModoEntrega);
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
        tiempoEspera.EsperarPor(4000);
        actor.attemptsTo(

                Click.on(boton_agregar_1),
                Click.on(boton_agregar_2),
                Click.on(boton_agregar_3),
                Click.on(boton_agregar_4),
                Click.on(boton_agregar_5)
        );
    }
}
