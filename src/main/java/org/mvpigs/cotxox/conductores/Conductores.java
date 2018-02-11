package org.mvpigs.cotxox.conductores;

import java.util.ArrayList;

public class Conductores {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private ArrayList<Double> valoracion;
    private double valoracionMedia = 0.0d;
    private boolean ocupado = false;

    public Conductores() {
        this.valoracion = new ArrayList();
    }

    public Conductores(String nombre, String modelo, String matricula) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
        this.valoracion = new ArrayList();
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
        this.valoracion.add(valoracion);
    }

    public double getValoracionMedia() {
        for (double puntuacion:valoracion) {
            valoracionMedia += puntuacion;
        }
        return valoracionMedia / valoracion.size();
    }

    public boolean isOcupado() {
        return this.ocupado;
    }


}