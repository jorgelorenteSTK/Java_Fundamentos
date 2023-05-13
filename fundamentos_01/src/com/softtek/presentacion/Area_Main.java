package com.softtek.presentacion;
import com.softtek.modelo.Area;

public class Area_Main {
    public static void main(String[] args) {
        double r = 2.5;

        double b = 10;
        double h = 5;

        System.out.println("El área de este círculo es: "+Area.calculateAreaCircle(r));
        System.out.println("El área de este rectángulo es: " +Area.calculateAreaRectangle(b, h));
    }
}
