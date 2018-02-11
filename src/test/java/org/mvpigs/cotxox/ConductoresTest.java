package org.mvpigs.cotxox;

import org.mvpigs.cotxox.conductores.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ConductoresTest {
    @Test
    public void testNuevoConductor() {
        Conductor conductor = new Conductor("Adrian", "Mercedes A", "7JKK555");
        System.out.println(conductor.getNombre());
    }

    @Test
    public void testSetValoracion() {
        Conductor conductor = new Conductor("Adrian", "Mercedes A", "7JKK555");
        conductor.setValoracion(4.0);
        assertEquals(4.0, conductor.getValoracionMedia(), 0.01);
    }

    @Test
    public void testValoracionMedia() {
        Conductor conductor = new Conductor("Adrian", "Mercedes A", "7JKK555");

        conductor.setValoracion(4.0);
        conductor.setValoracion(4.0);
        conductor.setValoracion(4.0);
        conductor.setValoracion(2.0);

        assertEquals(3.5, conductor.getValoracionMedia(), 0.01);        
    }

    @Test
    public void testConductorOcupado() {
        Conductor conductor = new Conductor("Adrian", "Mercedes A", "7JKK555");
        assertEquals(false, conductor.isOcupado());
    }
}