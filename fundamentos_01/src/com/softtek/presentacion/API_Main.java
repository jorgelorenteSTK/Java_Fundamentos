package com.softtek.presentacion;

public class API_Main {

    public static void main(String[] args) {
        String texto = "Bienvenidos al curso de Java";
        //Mostrar la cadena toda en mayúsculas
        System.out.println(texto.toUpperCase());
        //Mostrar la cadena en minúsculas
        System.out.println(texto.toLowerCase());
        //Mostrar solo la palabra Bienvenidos
        System.out.println(texto.substring(0,11));
        //Mostrar solo la palabra Java
        System.out.println(texto.substring(texto.lastIndexOf(" ") + 1));
        //Mostrar la palabra curso
        String[] palabrasTexto = texto.split(" ");
        System.out.println(palabrasTexto[2]);
        //Mostrar la posición de la letra c
        System.out.println(texto.indexOf("c"));
        //Devolver la longitud de la cadena
        System.out.println(texto.length());
        //Modificar las e minúsculas por E mayúsculas
        System.out.println(texto.replace("e", "E"));
        //Concatenar la frase anterior con “con fecha 14 de Septiembre”
        System.out.println(texto.concat(" con fecha 14 de Septiembre"));
    }
}
