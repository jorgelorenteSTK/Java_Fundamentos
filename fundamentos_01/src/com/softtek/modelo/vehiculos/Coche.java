package com.softtek.modelo.vehiculos;

public class Coche extends Vehiculo {

    private int puertas;
    private String modelo_motor;
    public Coche(double peso, String marca, String modelo, String color, int num_puertas, String modelo_motor) {
        super(peso, marca, modelo, color);
        this.puertas = num_puertas;
        this.modelo_motor = modelo_motor;
    }

    @Override
    public String obtenerDatos(){
        return super.obtenerDatos() + String.format("Es un coche de %f, y con modelo de motor %s",this.puertas,this.modelo_motor);
    }
}