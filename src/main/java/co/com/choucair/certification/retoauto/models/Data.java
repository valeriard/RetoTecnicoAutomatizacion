package co.com.choucair.certification.retoauto.models;

public class Data {
    private String cantidadProductoUno;
    private String cantidadProductoDos;
    private String cantidadProductoTres;
    private String cantidadProductoCuatro;
    private String cantidadProductoCinco;



    public Data(String cantidadProductoUno, String cantidadProductoDos, String cantidadProductoTres, String cantidadProductoCuatro, String cantidadProductoCinco, String correo) {
        this.cantidadProductoUno = cantidadProductoUno;
        this.cantidadProductoDos = cantidadProductoDos;
        this.cantidadProductoTres = cantidadProductoTres;
        this.cantidadProductoCuatro = cantidadProductoCuatro;
        this.cantidadProductoCinco = cantidadProductoCinco;

    }

    public String getCantidadProductoUno() {
        return cantidadProductoUno;
    }

    public String getCantidadProductoDos() {
        return cantidadProductoDos;
    }

    public String getCantidadProductoTres() {
        return cantidadProductoTres;
    }

    public String getCantidadProductoCuatro() {
        return cantidadProductoCuatro;
    }

    public String getCantidadProductoCinco() {
        return cantidadProductoCinco;
    }


}
