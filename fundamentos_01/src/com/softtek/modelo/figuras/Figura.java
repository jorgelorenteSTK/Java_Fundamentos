package com.softtek.modelo.figuras;

public class Figura {
    private int coordX;
    private int coordY;

    public Figura(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Figura() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public String posicion(){
        return "Posición de la figura: " + this.coordX + ", " + this.coordY;
    }
}