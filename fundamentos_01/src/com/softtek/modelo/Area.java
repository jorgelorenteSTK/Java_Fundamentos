package com.softtek.modelo;

public class Area {

    public static double calculateAreaCircle(double r){
        return Math.PI * r * r;
    }

    public static double calculateAreaRectangle(double b, double h){
        return b * h;
    }
}
