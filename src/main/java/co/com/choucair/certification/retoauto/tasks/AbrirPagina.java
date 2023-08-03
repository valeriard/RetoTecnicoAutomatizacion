package co.com.choucair.certification.retoauto.tasks;


import co.com.choucair.certification.retoauto.userinterfaces.PaginaExito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
  private PaginaExito paginaexito;
  public static AbrirPagina exito(){return Tasks.instrumented((AbrirPagina.class));
  }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaexito));
    }
}
