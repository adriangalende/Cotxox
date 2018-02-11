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

}