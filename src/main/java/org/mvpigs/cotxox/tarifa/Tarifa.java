package org.mvpigs.cotxox.tarifa;

public class Tarifa {
    private final double  COSTE_MILLA = 3.15;


    public double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }
}