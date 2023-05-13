package com.softtek.presentacion;
import com.softtek.modelo.Alumno;

public class Alumno_Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juanito");
        alumno.getNotas_alumno().get("Lengua").add(3);
        alumno.getNotas_alumno().get("Lengua").add(5);
        alumno.getNotas_alumno().get("Lengua").add(7);
        alumno.getNotas_alumno().get("Matemáticas").add(9);
        alumno.getNotas_alumno().get("Matemáticas").add(7);
        alumno.getNotas_alumno().get("Matemáticas").add(8);
        alumno.getNotas_alumno().get("Física").add(7);
        alumno.getNotas_alumno().get("Física").add(9);
        alumno.getNotas_alumno().get("Física").add(6);
        alumno.getNotas_alumno().get("Química").add(7);
        alumno.getNotas_alumno().get("Química").add(5);
        alumno.getNotas_alumno().get("Química").add(3);

        System.out.println("Calificaciones de: " + alumno.getNombre_completo() + " = \n" + alumno.mostrar_calificaciones());
        System.out.println("Medias de " + alumno.getNombre_completo() + " = \n" + alumno.promedio_calificaciones());

    }
}
