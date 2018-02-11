package org.mvpigs.cotxox;

import org.mvpigs.cotxox.carrera.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarreraTest{
    @Test
    
    public void testGetTarjetaCredito() {
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);
        assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
    }

}