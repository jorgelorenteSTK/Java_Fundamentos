package com.softtek.modelo.vehiculos;

public class Barco extends Vehiculo{

    private String unidadVelocidad;
    public Barco(double peso, String marca, String modelo, String color, String unidad) {
        super(peso,marca,modelo,color);
        this.unidadVelocidad = unidad;
    }

    @Override
    public String obtenerDatos(){
        return super.obtenerDatos() + String.format(" de tipo Barco que acelera en %s",this.unidadVelocidad);
    }
}
