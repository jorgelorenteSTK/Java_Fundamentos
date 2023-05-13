package com.softtek.modelo.vehiculos;

public class Vehiculo {
    private double peso;
    private String color;
    private String modelo;
    private String marca;

    public Vehiculo(double peso, String color, String modelo, String marca) {
        this.peso = peso;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String obtenerDatos(){
        return String.format("Peso: %f, Color: %s, Modelo: %s, Marca: %s", peso, color, modelo, marca);
    }
}
