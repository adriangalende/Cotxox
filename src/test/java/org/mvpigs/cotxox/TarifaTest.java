package org.mvpigs.cotxox;

import org.mvpigs.cotxox.tarifa.*;
import org.mvpigs.cotxox.carrera.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarifaTest {

    @Test
    public void testGetCosteDistancia() {

        Tarifa tarifa = new Tarifa();

        double distancia = 7.75;
        double costeMilla = 1.35;
        System.out.println(tarifa.getCosteDistancia(distancia));
        assertEquals((distancia * costeMilla), tarifa.getCosteDistancia(distancia), 0.01);
    }

    @Test
    public void testGetCosteTiempo() {
        Tarifa tarifa = new Tarifa();
        int tiempoEsperadoMinutos = 10;
        double costeMinuto = 0.35;
        System.out.println(tarifa.getCosteTiempo(tiempoEsperadoMinutos));
        assertEquals((tiempoEsperadoMinutos * costeMinuto), tarifa.getCosteTiempo(tiempoEsperadoMinutos), 0.01);

    }

    @Test
    public void testGetCosteTotalEsperado() {
        String tarjetaCredito = "4916119711304546";
        double distancia = 7.75;
        int tiempoEsperadoMinutos = 10;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        carrera.setDistancia(distancia);

        Tarifa tarifa = new Tarifa();
        assertEquals(16.755, tarifa.getCosteTotalEsperado(carrera), 0.01);
    }
}