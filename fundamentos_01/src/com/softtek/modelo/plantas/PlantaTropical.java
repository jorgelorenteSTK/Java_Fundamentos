package com.softtek.modelo.plantas;

public class PlantaTropical extends Planta{

    public PlantaTropical(String nombre_planta, int cantidad_agua_maxima){
        this.nombre_planta = nombre_planta;
        this.cantidad_agua_maxima = cantidad_agua_maxima;
        this.viva = true;
    }

    @Override
    public void regar(int cantidad, int tiempo){
        if (cantidad > this.cantidad_agua_maxima * 100 || cantidad * tiempo > this.cantidad_agua_maxima * 100){
            this.viva = false;
        }
    }
}