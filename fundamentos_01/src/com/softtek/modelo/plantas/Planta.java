package com.softtek.modelo.plantas;

public abstract class Planta {

    protected int cantidad_agua_maxima;

    protected String nombre_planta;

    protected boolean viva;
    public abstract void regar(int cantidad, int tiempo);

    @Override
    public String toString() {
        return String.format("La planta %s %s tiene una capacidad máxima de %d",this.viva ? "viva" : "muerta",nombre_planta,cantidad_agua_maxima);
    }
}