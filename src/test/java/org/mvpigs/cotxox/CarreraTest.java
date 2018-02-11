package org.mvpigs.cotxox;

import org.mvpigs.cotxox.carrera.*;
import org.mvpigs.cotxox.tarifa.*;
import org.mvpigs.cotxox.conductores.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
        
        assertEquals(16.755, carrera.getCosteEsperado(), 0.01);
    }

    @Test
    public void testAsignarConductor() {
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);

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
        
        carrera.asignarConductor(conductores);

        System.out.println(carrera.getConductor().toString());

    }

    @Test
    public void testRealizarPago() {
        String tarjetaCredito = "4916119711304546";
        int tiempoEsperadoMinutos = 10;
        double distancia = 7.75;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);    
        carrera.setDistancia(distancia);
        carrera.realizarPago(carrera.getCosteEsperado());
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);
    }

    @Test
    public void testRecibirPropina() {
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.recibirPropina(1);
        assertEquals(1, carrera.getPropina());       
    }

    @Test
    public void testLiberarConductor() {
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);

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
        
        carrera.asignarConductor(conductores);
        carrera.liberarConductor();
        assertEquals(false, carrera.getConductor().isOcupado());
    }


}