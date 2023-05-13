package com.softtek.modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno {
    private HashMap<String, ArrayList<Integer>> notas_alumno = new HashMap<String, ArrayList<Integer>>();

    private String nombre_completo;

    public Alumno(String nombre_completo) {
        this.nombre_completo = nombre_completo;
        this.notas_alumno.put("Lengua", new ArrayList<Integer>());
        this.notas_alumno.put("Matemáticas", new ArrayList<Integer>());
        this.notas_alumno.put("Física", new ArrayList<Integer>());
        this.notas_alumno.put("Química", new ArrayList<Integer>());
    }

    public HashMap<String, ArrayList<Integer>> getNotas_alumno() {
        return notas_alumno;
    }

    public void setNotas_alumno(HashMap<String, ArrayList<Integer>> notas_alumno) {
        this.notas_alumno = notas_alumno;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String mostrar_calificaciones() {
        String calificaciones = "";
        for (String key : notas_alumno.keySet()) {
            calificaciones += key + ":\n";
            for (Integer nota : notas_alumno.get(key)) {
                calificaciones += nota + " ";
            }
            calificaciones += "\n";
        }
        return calificaciones;
    }

    public String promedio_calificaciones() {
        String calificaciones = "";
        int suma = 0;
        for (String key : notas_alumno.keySet()) {
            suma = 0;
            for (Integer nota : notas_alumno.get(key)) {
                suma += nota;
            }
            calificaciones += key + ":\n";
            calificaciones += suma / notas_alumno.get(key).size() + "\n";
        }
        return calificaciones;
    }
}
