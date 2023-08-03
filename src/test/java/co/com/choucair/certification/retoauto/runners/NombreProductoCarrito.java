package co.com.choucair.certification.retoauto.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/nombre_producto_carrito.feature",
glue="co.com.choucair.certification.retoauto.stepdefinitions",
snippets = SnippetType.CAMELCASE )

public class NombreProductoCarrito {

}