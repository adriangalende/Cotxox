package org.mvpigs.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private ArrayList<Double> valoracion =  new ArrayList();
    private double valoracionMedia = 0.0d;
    private boolean ocupado = false;

    public Conductor() {
    }

    
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public Conductor(String nombre, String modelo, String matricula) {
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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    @Override
    public String toString() {
        return "Conductor: " + this.getNombre() + ", modelo de coche: " + this.getModelo() + "  matricula: " +
                this.getMatricula() + ", puntuacion media: " + this.getValoracionMedia() + " esta ocupad@?: " +
                this.isOcupado();
    }


}