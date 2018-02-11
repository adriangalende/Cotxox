package org.mvpigs.cotxox.tarifa;

import org.mvpigs.cotxox.carrera.*;

public class Tarifa {
    private final double  COSTE_MILLA = 1.35;
    private final double COSTE_TIEMPO = 0.35;
    public final double COSTE_MINIMO = 5;
    public final double COSTE_COMISION = 1.2; // 20% de comision 


    public double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public double getCosteTiempo(int minutos) {
        return minutos * COSTE_TIEMPO;
    }

    public double getCosteTotalEsperado(Carrera carrera) {
        double costeTotalEsperado = (getCosteTiempo(carrera.getTiempoEsperado()) + 
                getCosteDistancia(carrera.getDistancia())) * COSTE_COMISION;

        if (costeTotalEsperado <= COSTE_MINIMO) {
            return COSTE_MINIMO;
        }

        return costeTotalEsperado;
    }
}