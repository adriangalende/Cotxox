package org.mvpigs.cotxox.conductores;

import java.util.ArrayList;

public class PoolConductores {
    private ArrayList<Conductor> poolConductores;

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public ArrayList<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {
        Conductor chofer;
        for (Conductor conductor:getPoolConductores()){
            if (!(conductor.isOcupado())){
                chofer = new Conductor(conductor.getNombre());
                chofer.setModelo(conductor.getModelo());
                chofer.setMatricula(conductor.getMatricula());
                chofer.setValoracion(conductor.getValoracionMedia());
                chofer.setOcupado(true);
                return chofer;
            } else {} // el conductor esta ocupado, ignorar
        }
        return null;
    }

}