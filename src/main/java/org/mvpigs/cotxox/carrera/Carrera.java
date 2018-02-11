package org.mvpigs.cotxox.carrera;

public class Carrera {
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";

    public Carrera() {

    }

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

}