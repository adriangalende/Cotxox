package org.mvpigs.cotxox.carrera;

import org.mvpigs.cotxox.tarifa.Tarifa;
import org.mvpigs.cotxox.conductores.*;

public class Carrera {
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0d;
    private int tiempoEsperado = 0;
    private Conductor conductor = null;

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

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void asignarConductor(PoolConductores poolConductores) {
        setConductor(poolConductores.asignarConductor());
    }
}