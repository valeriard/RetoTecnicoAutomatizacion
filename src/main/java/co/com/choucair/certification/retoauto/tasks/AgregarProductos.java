package co.com.choucair.certification.retoauto.tasks;

import co.com.choucair.certification.retoauto.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarProductos implements Task {
    Data data;

    public AgregarProductos(Data data){
        this.data = data;
    }
    public static AgregarProductos alcarrito(Data data) {
        return Tasks.instrumented(AgregarProductos.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
