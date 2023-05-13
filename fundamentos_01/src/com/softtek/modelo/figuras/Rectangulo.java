package com.softtek.modelo.figuras;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto, int x, int y) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(){
        super(1,1);
        this.ancho = 1;
        this.alto = 1;
    }

    @Override
    public String posicion(){
        return super.posicion() + " de tipo Rectangulo de base " + this.ancho + " y altura " + this.alto;
    }
}
