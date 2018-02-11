package org.mvpigs.cotxox.tarifa;

public class Tarifa {
    private final double  COSTE_MILLA = 3.15;
    private final double COSTE_TIEMPO = 0.35;


    public double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public double getCosteTiempo(int minutos) {
        return minutos * COSTE_TIEMPO;
    }
}