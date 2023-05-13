package com.softtek.modelo;

public class Multiplicacion {
    private int num;

    public Multiplicacion(){
        this.num = 7;
    }

    public String showTable(){
        String cad = "";
        for(int i = 1; i <= 10; i++){
            cad += i + " * " + this.num + " = " + i * this.num;
            cad += "\n";
        }
        return cad;
    }
}
