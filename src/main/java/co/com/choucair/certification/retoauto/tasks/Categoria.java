package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Categoria implements Task {

    public static Categoria mercado() {
        return Tasks.instrumented(Categoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ObjetosTransversales.menu, WebElementStateMatchers.isClickable()),
                Click.on(ObjetosTransversales.menu),
                WaitUntil.the(ObjetosTransversales.categoria_mercado, WebElementStateMatchers.isVisible()),
                Click.on(ObjetosTransversales.categoria_mercado));
    }
}
