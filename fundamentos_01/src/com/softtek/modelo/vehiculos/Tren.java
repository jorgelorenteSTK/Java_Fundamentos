package com.softtek.modelo.vehiculos;

public class Tren extends Vehiculo{

    private String linea;
    public Tren(double peso, String marca, String modelo, String color, String linea) {
        super(peso,marca,modelo,color);
        this.linea = linea;
    }

    @Override
    public String obtenerDatos(){
        return super.obtenerDatos() + String.format(" de tipo Tren cuya linea es %s",this.linea);
    }
}