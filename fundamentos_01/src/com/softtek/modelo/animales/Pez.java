package com.softtek.modelo.animales;

public class Pez extends Animal{
    @Override
    public String comer() {
        return "El pez come algas";
    }

    @Override
    public String moverse() {
        return "El pez nada";
    }
}