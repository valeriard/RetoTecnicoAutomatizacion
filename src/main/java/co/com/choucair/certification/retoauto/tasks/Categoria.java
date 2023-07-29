package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.userinterfaces.ObjetosTransversales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Categoria implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ObjetosTransversales.categoria_mercado));
    }
}
