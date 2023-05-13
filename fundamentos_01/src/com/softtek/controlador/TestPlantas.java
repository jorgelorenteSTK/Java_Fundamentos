package com.softtek.controlador;

import com.softtek.modelo.plantas.*;

public class TestPlantas {
    public static void main(String[] args) {
        Cactus c1 = new Cactus("Pinchitos",100);
        PlantaTropical p1 = new PlantaTropical("Hojas",100);
        System.out.println(c1.toString());
        System.out.println(p1.toString());
        c1.regar(10,1);
        p1.regar(10,1);
        System.out.println(c1.toString());
        System.out.println(p1.toString());
    }
}
