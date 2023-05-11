package com.sofftek.presentacion;
import com.sofftek.modelo.Campos;

public class Main {
    public static void main(String[] args) {
        Campos c = new Campos();
        c.incrementa();
        System.out.println(c.muestra());
    }
}