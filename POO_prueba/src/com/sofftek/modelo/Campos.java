package com.sofftek.modelo;

public class Campos {
    private int x;

    public Campos(){
        this.x = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int muestra(){
        return this.x;
    }

    public void incrementa(){
        this.x++;
    }
}
