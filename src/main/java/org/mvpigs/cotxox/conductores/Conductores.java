package org.mvpigs.cotxox.conductores;

public class Conductores {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracion = 0.0d;

    public Conductores() {

    }

    public Conductores(String nombre, String modelo, String matricula) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return this.valoracion;
    }



}