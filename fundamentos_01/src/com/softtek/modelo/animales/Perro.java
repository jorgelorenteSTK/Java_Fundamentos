package com.softtek.modelo.animales;

public class Perro extends Animal{
    @Override
    public String comer(){
        return "El perro come comida de perro";
    }

    @Override
    public String moverse(){
        return "El perro corre con sus 4 patas";
    }
}
