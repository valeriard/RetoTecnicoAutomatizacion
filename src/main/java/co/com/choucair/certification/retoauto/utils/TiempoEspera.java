package co.com.choucair.certification.retoauto.utils;

import net.serenitybdd.screenplay.Performable;

public class TiempoEspera {
    public void EsperarPor(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

}
