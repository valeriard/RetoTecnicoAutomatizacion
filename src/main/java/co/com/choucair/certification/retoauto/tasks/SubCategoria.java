package co.com.choucair.certification.retoauto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales.*;

public class SubCategoria implements Task {
    public static SubCategoria cervezas() {
        return Tasks.instrumented(SubCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(subcategoria,WebElementStateMatchers.isVisible()),
                Scroll.to(subcategoria),
                Click.on(subcategoria));
    }
}
