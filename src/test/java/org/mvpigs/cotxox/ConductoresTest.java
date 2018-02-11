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
}