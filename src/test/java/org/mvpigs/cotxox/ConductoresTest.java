package org.mvpigs.cotxox;

import org.mvpigs.cotxox.conductores.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ConductoresTest {
    @Test
    public void testNuevoConductor() {
        Conductores conductor = new Conductores("Adrian", "Mercedes A", "7JKK555");
        System.out.println(conductor.getNombre());
    }

    @Test
    public void testSetValoracion() {
        Conductores conductor = new Conductores("Adrian", "Mercedes A", "7JKK555");
        conductor.setValoracion(4.0);
        assertEquals(4.0, conductor.getValoracionMedia(), 0.01);
    }

    @Test
    public void testValoracionMedia() {
        Conductores conductor = new Conductores("Adrian", "Mercedes A", "7JKK555");

        conductor.setValoracion(4.0);
        conductor.setValoracion(4.0);
        conductor.setValoracion(4.0);
        conductor.setValoracion(2.0);

        assertEquals(3.5, conductor.getValoracionMedia(), 0.01);        
    }

    @Test
    public void testConductorOcupado() {
        Conductores conductor = new Conductores("Adrian", "Mercedes A", "7JKK555");
        assertEquals(false, conductor.isOcupado());
    }
}