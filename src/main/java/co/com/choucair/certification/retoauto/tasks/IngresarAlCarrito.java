package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.utils.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.retoauto.userinterfaces.Carrito.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class IngresarAlCarrito implements Task {
    TiempoEspera tiempoEspera = new TiempoEspera();

    public static IngresarAlCarrito deCompras() {
        return instrumented(IngresarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(boton_carrito, WebElementStateMatchers.isVisible()),
                Click.on(boton_carrito),
                Click.on(boton_correo),
                Enter.theValue("valeriard1993@gmail.com").into(boton_correo),
                Click.on(confirmar_correo)

        );
        tiempoEspera.EsperarPor(3000);
    }
}
