package com.softtek.modelo.vehiculos;

public class Avion extends Vehiculo{

    private String fabricante;
    public Avion(double peso, String marca, String modelo, String color, String fabricante) {
        super(peso,marca,modelo,color);
        this.fabricante = fabricante;
    }

    @Override
    public String obtenerDatos(){
        return super.obtenerDatos() + String.format(" de tipo Avion cuyo fabricante es %s",this.fabricante);
    }
}