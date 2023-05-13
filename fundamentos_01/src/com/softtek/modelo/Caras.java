package com.softtek.modelo;

public interface Caras {
    public static String uno() {
        return "\t" + "*" + "\t";
    }

    public static String dos() {
        return "*" + "\t" + "\t" + "*";
    }

    public static String tres() {
        return "*" + "\t" + "*" + "\t" + "*";
    }

    public static String vacio() {
        return "\t" + "\t" + "\t";
    }
}
