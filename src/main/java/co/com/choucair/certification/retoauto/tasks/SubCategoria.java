package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SubCategoria implements Task {
    public static SubCategoria cervezas() {
        return Tasks.instrumented(SubCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ObjetosTransversales.subcategoria_mercado,WebElementStateMatchers.isClickable()),
                Click.on(ObjetosTransversales.subcategoria_mercado));
    }
}
