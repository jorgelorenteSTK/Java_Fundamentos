package com.softtek.controlador;

import com.softtek.modelo.animales.*;

import java.util.ArrayList;

public class TestAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> arrayAnimales = new ArrayList<>();

        arrayAnimales.add(new Pajaro());
        arrayAnimales.add(new Perro());
        arrayAnimales.add(new Pez());

        for (Animal a: arrayAnimales) {
            System.out.println(a.comer());
            System.out.println(a.moverse());
        }

    }
    /*
    ¿Qué ocurre si no implemento todos los métodos?
    Da error porque los métodos abstractos deben ser implementados en clases hijas

    ¿Puedo crear instancias igualmente?
    No porque no llega a compilar

    ¿Puedo modificar parte de la definición de los métodos abstractos?
    No

    ¿Puedo utilizar polimorfismo?
    Sí pero no será de los métodos heredados, sino ya de los sobreescritos en la clase hija

    Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
    ¿También son abstractas estas clases?

    No, porque Pajaro ya recoge los métodos abstractos
    */
}
