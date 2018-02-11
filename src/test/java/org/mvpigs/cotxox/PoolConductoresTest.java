package org.mvpigs.cotxox;

import java.util.ArrayList;
import java.util.Arrays;

import org.mvpigs.cotxox.conductores.*;
import org.mvpigs.cotxox.carrera.*;
import org.junit.*;
import static junit.framework.Assert.*;

public class PoolConductoresTest {
    @Test
    public void testCrearPoolConductores() {
        ArrayList<Conductor> poolConductores = new ArrayList();
        Conductor conductor = null;
        
        String[] nombres = { "Samantha", "Fox", "Mola" };
        
		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		// conductora.getClass().getFields();
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			// suponemos que las conductoras tienen una valoracion inicial de 4 stars
			conductora.setValoracion(4.0);
			index++;
		} 
		
		// Creamos el objeto flota de conductores, de la clase PoolConductores.

		PoolConductores conductores = new PoolConductores(poolConductores);

		for(Conductor chofer:conductores.getPoolConductores()) {
			System.out.println(chofer.toString());
		}

	}
	
	@Test
	public void testAsignarConductor() {
		ArrayList<Conductor> poolConductores = new ArrayList();
        Conductor conductor = null;
        
        String[] nombres = { "Samantha", "Fox", "Mola" };
        
		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		// conductora.getClass().getFields();
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			// suponemos que las conductoras tienen una valoracion inicial de 4 stars
			conductora.setValoracion(4.0);
			index++;
		} 
		
		// Creamos el objeto flota de conductores, de la clase PoolConductores.

		PoolConductores conductores = new PoolConductores(poolConductores);

			conductor = conductores.asignarConductor();
			System.out.println(conductor.toString());
			assertEquals(true, conductor.isOcupado());
		
	}
}