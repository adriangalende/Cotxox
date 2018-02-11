package org.mvpigs.cotxox;

import org.mvpigs.cotxox.carrera.*;
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

}