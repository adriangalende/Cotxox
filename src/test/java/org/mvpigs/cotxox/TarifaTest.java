package org.mvpigs.cotxox;

import org.mvpigs.cotxox.tarifa.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarifaTest() {
    @Test
    public void testGetCosteDistancia() {

        Tarifa tarifa = new Tarifa();

        double distancia = 7.75;
        double costeMilla = 1.35;

       assertEquals( (distancia * costeMilla) , tarifa.getCosteDistancia(distancia));
    }

    @Test
    public void testGetCosteTiempo() {
        Tarifa tarifa = new Tarifa();

        int tiempoEsperadoMinutos = 10;
        double costeMinuto = 0.35; 
        
        assertEquals((tiempoEsperadoMinutos * costeMinuto), tarifa.getCosteTiempo(tiempoEsperadoMinutos));

    }
}