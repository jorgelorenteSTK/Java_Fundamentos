package com.softtek.modelo.figuras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, int x, int y)  {
        super(x, y);
        this.radio = radio;
    }

    public Circulo(){
        super(1,1);
        this.radio = 1;
    }

    @Override
    public String posicion(){
        return super.posicion() + " de tipo Circulo de radio " + this.radio;
    }

}