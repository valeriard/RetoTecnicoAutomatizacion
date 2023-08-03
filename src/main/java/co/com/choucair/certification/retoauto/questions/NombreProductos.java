package co.com.choucair.certification.retoauto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextValue;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.retoauto.userinterfaces.Carrito.nombre_productoUno;


public class NombreProductos implements Question <Boolean> {

    private List<Map<String,String>> nombreproductos;

    public NombreProductos(List<Map<String, String>> nombreproductos) {
        this.nombreproductos = nombreproductos;
    }

    public static NombreProductos es(List<Map<String,String>> nombreproductos){
        return new NombreProductos(nombreproductos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultadoEsperado = false;
        String nombreCerveza = actor.asksFor(Text.of(nombre_productoUno).asString());
        System.out.println(nombreCerveza);
        if(nombreproductos.get(0).get("nombreProductoUno").equals(nombreCerveza)){
            resultadoEsperado= true;
        }
        return resultadoEsperado;
    }


}
