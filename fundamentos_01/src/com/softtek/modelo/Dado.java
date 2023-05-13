package com.softtek.modelo;

public class Dado {

    private int maximo;

    private int minimo;

    public Dado(int maximo, int minimo) {
        this.maximo = maximo;
        this.minimo = minimo;
    }

    public Dado(){
        this.maximo = 6;
        this.minimo = 1;
    }



    public int lanzarDado(){
        return Math.round((float)Math.random() * (maximo - minimo) + minimo);
    }

    public String vueltaDado(){
        String salida = "";
        int sol = this.lanzarDado();
        switch (sol){
            case 1:
                salida = Caras.vacio() + "\n" + Caras.uno() + "\n" + Caras.vacio();
                break;
            case 2:
                salida = Caras.vacio() + "\n" + Caras.dos() + "\n" + Caras.vacio();
                break;
            case 3:
                salida = Caras.vacio() + "\n" + Caras.tres() + "\n" + Caras.vacio();
                break;
            case 4:
                salida = Caras.dos() + "\n" + Caras.vacio() + "\n" + Caras.dos();
                break;
            case 5:
                salida = Caras.dos() + "\n" + Caras.uno() + "\n" + Caras.dos();
                break;
            case 6:
                salida = Caras.tres() + "\n" + Caras.vacio() + "\n" + Caras.tres();
                break;
            default:
                salida = "Error";
        }
        return salida;
    }
}
