package com.softtek.controlador;

import com.softtek.modelo.figuras.*;

public class TestFiguras {
    public static void main(String[] args){
        Figura f1 = new Figura(34,23);
        System.out.println(f1.posicion());
        Circulo c1 = new Circulo(12.3,42,23);
        System.out.println(c1.posicion());
        Rectangulo r1 = new Rectangulo(32,10,2,54);
        System.out.println(r1.posicion());
    }
}
