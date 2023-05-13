package com.softtek.controlador;

import com.softtek.modelo.vehiculos.*;

public class TestVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(3000,"Rojo","Patata","Blanca");
        Avion a1 = new Avion(50000,"Airbus","AX356","Blanco","Airbus");
        Barco b1 = new Barco(200,"JetMax","G323","Rojo","Nudos");
        Tren t1 = new Tren(5000,"ILikeTrains","Train","Azul","B34");

        System.out.println(v1.obtenerDatos());
        System.out.println(a1.obtenerDatos());
        System.out.println(b1.obtenerDatos());
        System.out.println(t1.obtenerDatos());
    }
}