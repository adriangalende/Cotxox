package org.mvpigs.cotxox;

import org.mvpigs.cotxox.carrera.*;
import org.mvpigs.cotxox.tarifa.Tarifa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarreraTest {
    @Test

    public void testGetTarjetaCredito() {
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);
        assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
    }

    @Test
    public void testGetOrigen() {
        String tarjetaCredito = "4916119711304546";
        String origen = "Aeroport Son Sant Joan";

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());

    }

    @Test
    public void testGetDestino() {
        String tarjetaCredito = "4916119711304546";
        String destino = "Magaluf";

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());

    }

    @Test
    public void testGetDistancia() {
        String tarjetaCredito = "4916119711304546";
        double distancia = 7.75;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(), 0.001);

    }

    @Test
    public void testGetTiempoEsperado() {
        String tarjetaCredito = "4916119711304546";
        int tiempoEsperadoMinutos = 10;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals(tiempoEsperadoMinutos, carrera.getTiempoEsperado());      
    }

    @Test
    public void testgetCosteEsperado() {
        String tarjetaCredito = "4916119711304546";
        int tiempoEsperadoMinutos = 10;
        double distancia = 7.75;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);    
        carrera.setDistancia(distancia);

        Tarifa tarifa = new Tarifa();
        
        assertEquals(16.755, carrera.getCosteEsperado(), 0.01);
    }


}